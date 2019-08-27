import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class OliverCompile {
    public static void main(String[] args) {
        String fileName = args[0];
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            compile(input);
        } catch (Exception e){
            System.out.println(e.toString());
        }

    }

    public static void compile (CharStream input) throws Exception {
        OliverLexer lexer = new OliverLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        OliverParser parser = new OliverParser(tokens);
        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new OliverToCpp(), tree);
    }
}