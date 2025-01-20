// generated with ast extension for cup
// version 0.8
// 20/0/2025 13:21:54


package rs.ac.bg.etf.pp1.ast;

public class PrintExprNumConst extends Statement {

    private Expr Expr;
    private NumConstMaybe NumConstMaybe;

    public PrintExprNumConst (Expr Expr, NumConstMaybe NumConstMaybe) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.NumConstMaybe=NumConstMaybe;
        if(NumConstMaybe!=null) NumConstMaybe.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public NumConstMaybe getNumConstMaybe() {
        return NumConstMaybe;
    }

    public void setNumConstMaybe(NumConstMaybe NumConstMaybe) {
        this.NumConstMaybe=NumConstMaybe;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(NumConstMaybe!=null) NumConstMaybe.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(NumConstMaybe!=null) NumConstMaybe.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(NumConstMaybe!=null) NumConstMaybe.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("PrintExprNumConst(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(NumConstMaybe!=null)
            buffer.append(NumConstMaybe.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [PrintExprNumConst]");
        return buffer.toString();
    }
}
