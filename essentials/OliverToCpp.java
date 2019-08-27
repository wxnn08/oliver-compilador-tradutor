import java.util.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class OliverToCpp extends OliverBaseListener {

    private int identation = 0;
    Vector<String> output = new Vector();
    Map<String,Integer> variaveis = new HashMap<String,Integer>();

    private void newLine(String lineToWrite) {
        String idtStr = "";
        for(int i = 0; i < identation; i++) idtStr += "    ";
        output.add(idtStr+lineToWrite);
    }

    private void printHeader() {
        newLine("//----------------------------------------");
        newLine("//- Oliver says: Só quero te dar carinho -");
        newLine("//----------------------------------------");
        newLine("#include<iostream>");
        newLine("using namespace std;");
    }

    private void printFooter() {
    }

    private void throwRuntimeException(String message) {
        throw new RuntimeException(message);
    }

    private void saveOutput() {
        try {
            FileWriter outputFile = new FileWriter("output.cpp");
            BufferedWriter writerFile = new BufferedWriter(outputFile);

            for(String command:output) {
                writerFile.write(command);
                writerFile.newLine();
            }
            writerFile.close();
            outputFile.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void enterProg(OliverParser.ProgContext ctx) {
        printHeader();
        newLine("int main() {");
        identation++;
    }

    @Override
    public void exitProg(OliverParser.ProgContext ctx) {
        newLine("return 0;");
        identation--;
        newLine("}");
        printFooter();
        saveOutput();
    }

    @Override
    public void enterDeclara(OliverParser.DeclaraContext ctx) {
        String declare = "";

        if(ctx.TIPO().getText().equals("real")) declare += "double ";
        else declare += "int ";

        for(int i = 0; i < ctx.ID().size(); i++) {

            String var = ctx.ID().get(i).getText();
            declare += var + (i+1 == ctx.ID().size() ? "":", ");

            if(variaveis.containsKey(var)) {
                throwRuntimeException("Variavel " + var + "ja declarada");
            } else {
                variaveis.put(var, 0);
            }
        }

        declare += ";";
        newLine(declare);
    }

    @Override
    public void enterCmdExpr(OliverParser.CmdExprContext ctx) {
        String var = ctx.ID().getText();
        if(!variaveis.containsKey(var)) {
            throwRuntimeException("Variável " + var + " não declarada.");
        } else {
            newLine(var + " = " + getExpr(ctx.expr()) + ";");
        }
    }

    @Override
    public void enterCmdLeitura(OliverParser.CmdLeituraContext ctx) {
        String cin = "";
        cin += "cin >> " + ctx.ID().getText() + ";";
        newLine(cin);
    }

    @Override
    public void enterCmdEscrita(OliverParser.CmdEscritaContext ctx) {
        String cout = "";
        cout += "cout << ";
        if(ctx.ID() == null) cout += ctx.TEXTO().getText();
        else cout += ctx.ID().getText();
        cout += " <<endl;";
        newLine(cout);
    }

    @Override 
    public void enterCmdIf(OliverParser.CmdIfContext ctx) {
        String cond = 
            "if (" 
            + getExpr(ctx.expr().get(0))
            + ctx.OP_REL().getText()
            + getExpr(ctx.expr().get(1))
            + ") {";
        newLine(cond);
        identation++;
    }

    @Override 
    public void exitCmdIf(OliverParser.CmdIfContext ctx) {
        if(ctx.cmdElse() == null) {
            identation--;
            newLine("}");
        }
    }

    @Override
    public void enterCmdElse(OliverParser.CmdElseContext ctx) {
        String cond = "} else {";

        identation--;
        newLine(cond);
        identation++;
    }

    @Override
    public void exitCmdElse(OliverParser.CmdElseContext ctx) {
        identation--;
        newLine("}");
    }

    @Override 
    public void enterCmdWhile(OliverParser.CmdWhileContext ctx) {
        String loop = 
            "while (" 
            + getExpr(ctx.expr().get(0))
            + ctx.OP_REL().getText()
            + getExpr(ctx.expr().get(1))
            + ") {";
        newLine(loop);
        identation++;
    }

    @Override 
    public void exitCmdWhile(OliverParser.CmdWhileContext ctx) {
        identation--;
        newLine("}");
    }

    @Override
    public void enterCmdDoWhile(OliverParser.CmdDoWhileContext ctx) {
        newLine("do {");
        identation++;
    }

    @Override
    public void exitCmdDoWhile(OliverParser.CmdDoWhileContext ctx) {
        String loop = 
            "} while (" 
            + getExpr(ctx.expr().get(0))
            + ctx.OP_REL().getText()
            + getExpr(ctx.expr().get(1))
            + ");";

        identation--;
        newLine(loop);
    }

    private String getExpr(OliverParser.ExprContext ctx) {
        if(ctx.OP_AS() != null) 
            return getExpr(ctx.expr()) + ctx.OP_AS().getText() + getTermo(ctx.termo());
        return getTermo(ctx.termo());
    }

    private String getTermo(OliverParser.TermoContext ctx) {
        if(ctx.OP_AC() != null) 
            return getTermo(ctx.termo()) + ctx.OP_AC().getText() + getFator(ctx.fator());
        return getFator(ctx.fator());
    }

    private String getFator(OliverParser.FatorContext ctx) {
        if(ctx.NUM() != null) 
            return ctx.NUM().getText();
        if(ctx.REAL() != null) 
            return ctx.REAL().getText();
        if(ctx.ID() != null) {
            String var = ctx.ID().getText();
            if(!variaveis.containsKey(var))
                throwRuntimeException("Variável " + var + " não declarada.");
            return ctx.ID().getText();
        }

        return '(' + getExpr(ctx.expr()) + ')';
    }
}