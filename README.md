Developing a compiler for the programming language MicroJava. The compiler enables the translation of syntactically and semantically correct MicroJava programs into MicroJava bytecode, which is executed on the virtual machine for MicroJava.

The compiler for MicroJava includes four main functionalities: lexical analysis, syntax analysis, semantic analysis and code generation.

The lexical analyzer is responsible for recognizing the language's lexemes and returning a set of tokens extracted from the source code, which are further processed in syntax analysis. If a lexical error is detected during lexical analysis, an appropriate error message should be printed to the output.

The syntax analyzer determines whether the tokens extracted from the source code form grammatically correct sentences. During the parsing of MicroJava programs, the parsing process itself should be tracked in a manner that will be described in detail later in the document. After parsing syntactically correct MicroJava programs, the user should be notified of the successful parsing. If the source code contains syntax errors, an adequate explanation of the detected syntax error should be provided, recovery should be performed, and parsing should continue.

The semantic analyzer is constructed based on the abstract syntax tree generated as a result of syntax analysis. Semantic analysis is performed by implementing methods for visiting the nodes of the abstract syntax tree. The tree is formed based on the grammar implemented in the previous phase. If the source code contains semantic errors, an appropriate message about the detected semantic error should be displayed.

The code generator translates syntactically and semantically correct programs into an executable form for the selected execution environment, MicroJava VM. Code generation is implemented in a manner similar to semantic analysis, by implementing methods that visit the nodes of the abstract syntax tree.







