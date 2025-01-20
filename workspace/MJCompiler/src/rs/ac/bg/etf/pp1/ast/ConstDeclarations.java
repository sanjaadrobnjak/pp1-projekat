// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclarations extends ConstDecl {

    private Type Type;
    private String I2;
    private Consts Consts;
    private ConstsList ConstsList;

    public ConstDeclarations (Type Type, String I2, Consts Consts, ConstsList ConstsList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.I2=I2;
        this.Consts=Consts;
        if(Consts!=null) Consts.setParent(this);
        this.ConstsList=ConstsList;
        if(ConstsList!=null) ConstsList.setParent(this);
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

    public Consts getConsts() {
        return Consts;
    }

    public void setConsts(Consts Consts) {
        this.Consts=Consts;
    }

    public ConstsList getConstsList() {
        return ConstsList;
    }

    public void setConstsList(ConstsList ConstsList) {
        this.ConstsList=ConstsList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(Consts!=null) Consts.accept(visitor);
        if(ConstsList!=null) ConstsList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(Consts!=null) Consts.traverseTopDown(visitor);
        if(ConstsList!=null) ConstsList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(Consts!=null) Consts.traverseBottomUp(visitor);
        if(ConstsList!=null) ConstsList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclarations(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(Consts!=null)
            buffer.append(Consts.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstsList!=null)
            buffer.append(ConstsList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclarations]");
        return buffer.toString();
    }
}
