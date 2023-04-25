package org.example;

import java.util.ArrayList;

public class FunctionNode extends ASTNode{
    String id = "function";
    public int line;
    String functionName;
    ArrayList<DeclarationNode> parameters;
    ArrayList<ASTNode> lines;
    ReturnNode returnValue;
    FunctionNode(String functionName, ArrayList<DeclarationNode> parameters, ArrayList<ASTNode> lines, ReturnNode returnValue, int line) {
        super();
        this.functionName = functionName;
        this.parameters = parameters;
        this.lines = lines;
        this.returnValue = returnValue;
        this.line = line;
    }
}
