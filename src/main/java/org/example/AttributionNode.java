package org.example;

public class AttributionNode extends ASTNode{
    String id = "attribution";
    public int line;
    String variable;
    ASTNode value;
    AttributionNode(String variable, ASTNode value, int line) {
        super();
        this.variable = variable;
        this.value = value;
        this.line = line;
    }
}
