// generated with ast extension for cup
// version 0.8
// 19/0/2025 16:26:36


package rs.ac.bg.etf.pp1.ast;

public class NoFormParameters extends FormParsList {

    public NoFormParameters () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NoFormParameters(\n");

        buffer.append(tab);
        buffer.append(") [NoFormParameters]");
        return buffer.toString();
    }
}