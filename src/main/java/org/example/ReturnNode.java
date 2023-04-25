package org.example;

public class ReturnNode extends ASTNode{
    String id = "return";
    public int line;
    public ExpressionNode value;
    ReturnNode(ExpressionNode value, int line) {
        super();
        this.value = value;
        this.line = line;
    }

}

