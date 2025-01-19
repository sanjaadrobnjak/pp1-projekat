// generated with ast extension for cup
// version 0.8
// 19/0/2025 16:26:36


package rs.ac.bg.etf.pp1.ast;

public class Declarations extends DeclList {

    private DeclList DeclList;
    private ConstVarDecls ConstVarDecls;

    public Declarations (DeclList DeclList, ConstVarDecls ConstVarDecls) {
        this.DeclList=DeclList;
        if(DeclList!=null) DeclList.setParent(this);
        this.ConstVarDecls=ConstVarDecls;
        if(ConstVarDecls!=null) ConstVarDecls.setParent(this);
    }

    public DeclList getDeclList() {
        return DeclList;
    }

    public void setDeclList(DeclList DeclList) {
        this.DeclList=DeclList;
    }

    public ConstVarDecls getConstVarDecls() {
        return ConstVarDecls;
    }

    public void setConstVarDecls(ConstVarDecls ConstVarDecls) {
        this.ConstVarDecls=ConstVarDecls;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DeclList!=null) DeclList.accept(visitor);
        if(ConstVarDecls!=null) ConstVarDecls.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DeclList!=null) DeclList.traverseTopDown(visitor);
        if(ConstVarDecls!=null) ConstVarDecls.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DeclList!=null) DeclList.traverseBottomUp(visitor);
        if(ConstVarDecls!=null) ConstVarDecls.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Declarations(\n");

        if(DeclList!=null)
            buffer.append(DeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstVarDecls!=null)
            buffer.append(ConstVarDecls.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Declarations]");
        return buffer.toString();
    }
}
