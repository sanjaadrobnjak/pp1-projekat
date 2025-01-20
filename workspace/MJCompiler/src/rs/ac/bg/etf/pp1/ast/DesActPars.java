// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class DesActPars extends Factor {

    private Designator Designator;
    private ParenActParsMaybe ParenActParsMaybe;

    public DesActPars (Designator Designator, ParenActParsMaybe ParenActParsMaybe) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.ParenActParsMaybe=ParenActParsMaybe;
        if(ParenActParsMaybe!=null) ParenActParsMaybe.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public ParenActParsMaybe getParenActParsMaybe() {
        return ParenActParsMaybe;
    }

    public void setParenActParsMaybe(ParenActParsMaybe ParenActParsMaybe) {
        this.ParenActParsMaybe=ParenActParsMaybe;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(ParenActParsMaybe!=null) ParenActParsMaybe.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(ParenActParsMaybe!=null) ParenActParsMaybe.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(ParenActParsMaybe!=null) ParenActParsMaybe.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesActPars(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ParenActParsMaybe!=null)
            buffer.append(ParenActParsMaybe.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesActPars]");
        return buffer.toString();
    }
}
