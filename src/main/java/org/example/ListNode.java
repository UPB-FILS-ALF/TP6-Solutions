package org.example;

import java.util.ArrayList;

public class ListNode extends ASTNode{
    String id = "list";
    public int line;
    public ArrayList<Object> values;
    ListNode(ArrayList<Object> values, int line) {
        super();
        this.values = values;
        this.line = line;
    }

}

