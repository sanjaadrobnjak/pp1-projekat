// generated with ast extension for cup
// version 0.8
// 19/0/2025 16:26:36


package rs.ac.bg.etf.pp1.ast;

public class Decr extends DesOrExpr {

    public Decr () {
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
        buffer.append("Decr(\n");

        buffer.append(tab);
        buffer.append(") [Decr]");
        return buffer.toString();
    }
}