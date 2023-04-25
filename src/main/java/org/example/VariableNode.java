package org.example;

public class VariableNode extends ASTNode{
    String id = "variable";
    public int line;
    String variableName;
    VariableNode(String variableName, int line) {
        super();
        this.variableName = variableName;
        this.line = line;
    }
}
