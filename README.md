# oliver-compilador-tradutor

*Compilador Oliver. Traduz a linguagem oliveriana para C++, um verdadeiro prodígio.*

Tradutor feito para a disciplina de Compiladores da Universidade Federal do ABC.

Criado por: 

- Bryan Batista Valeriano (BryanValeriano). RA: 21061215 
- Wesley Pereira da Silva (wxnn08). RA: 11006216



## Como rodar

Após instalar o `antlr4`, escreva os seguintes comandos no diretório `essentials`:

> antlr4 Oliver.g4
> 
> javac *.java
> 
> java OliverCompile \[arquivo.oli\]

O `[arquivo.oli]` deve ser escrito previamente na linguagem Oliver e deve passado como argumento para a classe OliverCompile. Existem alguns exemplos no diretório `examples` que podem ser úteis.

## A linguagem Oliver

Estrutura básica:

> Oliver 
> 
> \[declarações\]
> 
> \[comando(s)\]
> 
> Moriturus te saluto
> 

### Declarações

As declarações podem ser de variáveis do tipo `integer` ou `real`. Elas são feitas na forma `let` (lista de variáveis separadas por virgula) `as tipo` 

Exemplos:

> let a as real
> 
> let b as integer
> 
> let a, b as integer

### Comandos

Os comandos podem ser to tipo:

> Atribuição: `a = b`
>
> Condicional: `if ([condição]) { [comandos] }` . Pode ou não ser acompanhado por um `else ([condição]) { [comandos] }`
>
> Repetição: `while ([condição] { [comando] }) ` ou `do { [comandos] } while( [condição])`
>
> Leitura: `write ([variável]` ou `["texto"])`
>
> Escrita: `read ([variável])` 