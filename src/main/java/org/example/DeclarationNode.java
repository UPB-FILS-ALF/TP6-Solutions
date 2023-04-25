package org.example;

public class DeclarationNode extends ASTNode{
    String id = "declaration";
    public int line;
    String variableType;
    String variable;
    //String op;
    ASTNode value;
    DeclarationNode(String variableType, String variable, ASTNode value, int line) {
        super();
        this.variableType = variableType;
        this.variable = variable;
        this.value = value;
        this.line = line;
    }
}
