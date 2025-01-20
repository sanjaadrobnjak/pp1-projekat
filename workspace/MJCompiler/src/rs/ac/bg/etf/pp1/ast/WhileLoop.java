// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class WhileLoop extends Statement {

    private Statement Statement;
    private CondDesignatorStmtMaybe CondDesignatorStmtMaybe;

    public WhileLoop (Statement Statement, CondDesignatorStmtMaybe CondDesignatorStmtMaybe) {
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
        this.CondDesignatorStmtMaybe=CondDesignatorStmtMaybe;
        if(CondDesignatorStmtMaybe!=null) CondDesignatorStmtMaybe.setParent(this);
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public CondDesignatorStmtMaybe getCondDesignatorStmtMaybe() {
        return CondDesignatorStmtMaybe;
    }

    public void setCondDesignatorStmtMaybe(CondDesignatorStmtMaybe CondDesignatorStmtMaybe) {
        this.CondDesignatorStmtMaybe=CondDesignatorStmtMaybe;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Statement!=null) Statement.accept(visitor);
        if(CondDesignatorStmtMaybe!=null) CondDesignatorStmtMaybe.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
        if(CondDesignatorStmtMaybe!=null) CondDesignatorStmtMaybe.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        if(CondDesignatorStmtMaybe!=null) CondDesignatorStmtMaybe.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("WhileLoop(\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CondDesignatorStmtMaybe!=null)
            buffer.append(CondDesignatorStmtMaybe.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [WhileLoop]");
        return buffer.toString();
    }
}
