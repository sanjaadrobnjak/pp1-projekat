// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class YesConditionDesignatorStmt extends CondDesignatorStmtMaybe {

    private Condition Condition;
    private DesignatorStmtMaybe DesignatorStmtMaybe;

    public YesConditionDesignatorStmt (Condition Condition, DesignatorStmtMaybe DesignatorStmtMaybe) {
        this.Condition=Condition;
        if(Condition!=null) Condition.setParent(this);
        this.DesignatorStmtMaybe=DesignatorStmtMaybe;
        if(DesignatorStmtMaybe!=null) DesignatorStmtMaybe.setParent(this);
    }

    public Condition getCondition() {
        return Condition;
    }

    public void setCondition(Condition Condition) {
        this.Condition=Condition;
    }

    public DesignatorStmtMaybe getDesignatorStmtMaybe() {
        return DesignatorStmtMaybe;
    }

    public void setDesignatorStmtMaybe(DesignatorStmtMaybe DesignatorStmtMaybe) {
        this.DesignatorStmtMaybe=DesignatorStmtMaybe;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Condition!=null) Condition.accept(visitor);
        if(DesignatorStmtMaybe!=null) DesignatorStmtMaybe.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Condition!=null) Condition.traverseTopDown(visitor);
        if(DesignatorStmtMaybe!=null) DesignatorStmtMaybe.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Condition!=null) Condition.traverseBottomUp(visitor);
        if(DesignatorStmtMaybe!=null) DesignatorStmtMaybe.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("YesConditionDesignatorStmt(\n");

        if(Condition!=null)
            buffer.append(Condition.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorStmtMaybe!=null)
            buffer.append(DesignatorStmtMaybe.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [YesConditionDesignatorStmt]");
        return buffer.toString();
    }
}
