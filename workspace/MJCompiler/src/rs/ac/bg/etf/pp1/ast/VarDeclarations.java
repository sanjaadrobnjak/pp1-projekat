// generated with ast extension for cup
// version 0.8
// 20/0/2025 13:21:54


package rs.ac.bg.etf.pp1.ast;

public class VarDeclarations extends VarDecl {

    private Type Type;
    private String I2;
    private Bracket Bracket;
    private VarsList VarsList;

    public VarDeclarations (Type Type, String I2, Bracket Bracket, VarsList VarsList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.I2=I2;
        this.Bracket=Bracket;
        if(Bracket!=null) Bracket.setParent(this);
        this.VarsList=VarsList;
        if(VarsList!=null) VarsList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
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

    public VarsList getVarsList() {
        return VarsList;
    }

    public void setVarsList(VarsList VarsList) {
        this.VarsList=VarsList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(Bracket!=null) Bracket.accept(visitor);
        if(VarsList!=null) VarsList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(Bracket!=null) Bracket.traverseTopDown(visitor);
        if(VarsList!=null) VarsList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(Bracket!=null) Bracket.traverseBottomUp(visitor);
        if(VarsList!=null) VarsList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclarations(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
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

        if(VarsList!=null)
            buffer.append(VarsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclarations]");
        return buffer.toString();
    }
}
