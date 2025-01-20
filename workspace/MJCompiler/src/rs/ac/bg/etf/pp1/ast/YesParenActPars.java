// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class YesParenActPars extends ParenActParsMaybe {

    private ActParsMaybe ActParsMaybe;

    public YesParenActPars (ActParsMaybe ActParsMaybe) {
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
        buffer.append("YesParenActPars(\n");

        if(ActParsMaybe!=null)
            buffer.append(ActParsMaybe.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [YesParenActPars]");
        return buffer.toString();
    }
}
