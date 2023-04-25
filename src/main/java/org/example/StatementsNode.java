package org.example;

import java.util.ArrayList;

public class StatementsNode extends ASTNode{
    String id = "statements";
    public int line;
    ArrayList<ASTNode> statements;
    StatementsNode(ArrayList<ASTNode> statements, int line) {
        super();
        this.statements = statements;
        this.line = line;
    }
}
