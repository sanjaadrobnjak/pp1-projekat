// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class Variables extends VarsList {

    private VarsList VarsList;
    private String I2;
    private Bracket Bracket;

    public Variables (VarsList VarsList, String I2, Bracket Bracket) {
        this.VarsList=VarsList;
        if(VarsList!=null) VarsList.setParent(this);
        this.I2=I2;
        this.Bracket=Bracket;
        if(Bracket!=null) Bracket.setParent(this);
    }

    public VarsList getVarsList() {
        return VarsList;
    }

    public void setVarsList(VarsList VarsList) {
        this.VarsList=VarsList;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public Bracket getBracket() {
        return Bracket;
    }

    public void setBracket(Bracket Bracket) {
        this.Bracket=Bracket;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarsList!=null) VarsList.accept(visitor);
        if(Bracket!=null) Bracket.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarsList!=null) VarsList.traverseTopDown(visitor);
        if(Bracket!=null) Bracket.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarsList!=null) VarsList.traverseBottomUp(visitor);
        if(Bracket!=null) Bracket.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Variables(\n");

        if(VarsList!=null)
            buffer.append(VarsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(Bracket!=null)
            buffer.append(Bracket.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Variables]");
        return buffer.toString();
    }
}
