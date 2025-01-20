// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class CondFact implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private Expr Expr;
    private RelopExprMaybe RelopExprMaybe;

    public CondFact (Expr Expr, RelopExprMaybe RelopExprMaybe) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.RelopExprMaybe=RelopExprMaybe;
        if(RelopExprMaybe!=null) RelopExprMaybe.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public RelopExprMaybe getRelopExprMaybe() {
        return RelopExprMaybe;
    }

    public void setRelopExprMaybe(RelopExprMaybe RelopExprMaybe) {
        this.RelopExprMaybe=RelopExprMaybe;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(RelopExprMaybe!=null) RelopExprMaybe.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(RelopExprMaybe!=null) RelopExprMaybe.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(RelopExprMaybe!=null) RelopExprMaybe.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondFact(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(RelopExprMaybe!=null)
            buffer.append(RelopExprMaybe.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondFact]");
        return buffer.toString();
    }
}
