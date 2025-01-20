// generated with ast extension for cup
// version 0.8
// 20/0/2025 13:21:54


package rs.ac.bg.etf.pp1.ast;

public class ParenActPars extends DesOrExpr {

    private ActParsMaybe ActParsMaybe;

    public ParenActPars (ActParsMaybe ActParsMaybe) {
        this.ActParsMaybe=ActParsMaybe;
        if(ActParsMaybe!=null) ActParsMaybe.setParent(this);
    }

    public ActParsMaybe getActParsMaybe() {
        return ActParsMaybe;
    }

    public void setActParsMaybe(ActParsMaybe ActParsMaybe) {
        this.ActParsMaybe=ActParsMaybe;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ActParsMaybe!=null) ActParsMaybe.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ActParsMaybe!=null) ActParsMaybe.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ActParsMaybe!=null) ActParsMaybe.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ParenActPars(\n");

        if(ActParsMaybe!=null)
            buffer.append(ActParsMaybe.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ParenActPars]");
        return buffer.toString();
    }
}
