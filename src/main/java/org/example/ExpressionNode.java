package org.example;

public class ExpressionNode extends ASTNode{
    String id = "expression";
    public int line;
    ASTNode left;
    ASTNode right;
    String op;

    public ExpressionNode(ASTNode left, ASTNode right, String op, int line) {
        super();
        this.left = left;
        this.right = right;
        this.op = op;
        this.line = line;
    }
    public ExpressionNode(ASTNode right, String op, int line) {
        super();
        this.right = right;
        this.op = op;
        this.line = line;
    }
}
