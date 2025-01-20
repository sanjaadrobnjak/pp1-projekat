// generated with ast extension for cup
// version 0.8
// 20/0/2025 13:21:54


package rs.ac.bg.etf.pp1.ast;

public class EqualOper extends Relop {

    public EqualOper () {
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
        buffer.append("EqualOper(\n");

        buffer.append(tab);
        buffer.append(") [EqualOper]");
        return buffer.toString();
    }
}
