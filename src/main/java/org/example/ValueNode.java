package org.example;

public class ValueNode extends ASTNode{
    String id = "value";
    public int line;
    public Object value;
    ValueNode(Object value, int line) {
        super();
        this.value = value;
        this.line = line;
    }

}

