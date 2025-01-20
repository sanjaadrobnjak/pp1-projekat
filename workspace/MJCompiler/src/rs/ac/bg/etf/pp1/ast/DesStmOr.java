// generated with ast extension for cup
// version 0.8
// 20/0/2025 13:21:54


package rs.ac.bg.etf.pp1.ast;

public class DesStmOr extends DesignatorStatement {

    private Designator Designator;
    private DesOrExpr DesOrExpr;

    public DesStmOr (Designator Designator, DesOrExpr DesOrExpr) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.DesOrExpr=DesOrExpr;
        if(DesOrExpr!=null) DesOrExpr.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public DesOrExpr getDesOrExpr() {
        return DesOrExpr;
    }

    public void setDesOrExpr(DesOrExpr DesOrExpr) {
        this.DesOrExpr=DesOrExpr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(DesOrExpr!=null) DesOrExpr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(DesOrExpr!=null) DesOrExpr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(DesOrExpr!=null) DesOrExpr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesStmOr(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesOrExpr!=null)
            buffer.append(DesOrExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesStmOr]");
        return buffer.toString();
    }
}
