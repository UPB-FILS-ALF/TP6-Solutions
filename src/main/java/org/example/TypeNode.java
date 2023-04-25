package org.example;

public class TypeNode extends ASTNode{
    String id = "value";
    public int line;
    String typeName;
    TypeNode(String typeName, int line) {
        super();
        this.typeName = typeName;
        this.line = line;
    }
}
