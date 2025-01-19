// generated with ast extension for cup
// version 0.8
// 19/0/2025 16:26:36


package rs.ac.bg.etf.pp1.ast;

public class Constants extends ConstsList {

    private ConstsList ConstsList;
    private String I2;
    private Consts Consts;

    public Constants (ConstsList ConstsList, String I2, Consts Consts) {
        this.ConstsList=ConstsList;
        if(ConstsList!=null) ConstsList.setParent(this);
        this.I2=I2;
        this.Consts=Consts;
        if(Consts!=null) Consts.setParent(this);
    }

    public ConstsList getConstsList() {
        return ConstsList;
    }

    public void setConstsList(ConstsList ConstsList) {
        this.ConstsList=ConstsList;
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

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstsList!=null) ConstsList.accept(visitor);
        if(Consts!=null) Consts.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstsList!=null) ConstsList.traverseTopDown(visitor);
        if(Consts!=null) Consts.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstsList!=null) ConstsList.traverseBottomUp(visitor);
        if(Consts!=null) Consts.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Constants(\n");

        if(ConstsList!=null)
            buffer.append(ConstsList.toString("  "+tab));
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

        buffer.append(tab);
        buffer.append(") [Constants]");
        return buffer.toString();
    }
}
