// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class VariableDeclarationss extends VarDeclarat {

    private VarDeclarat VarDeclarat;
    private VarDecl VarDecl;

    public VariableDeclarationss (VarDeclarat VarDeclarat, VarDecl VarDecl) {
        this.VarDeclarat=VarDeclarat;
        if(VarDeclarat!=null) VarDeclarat.setParent(this);
        this.VarDecl=VarDecl;
        if(VarDecl!=null) VarDecl.setParent(this);
    }

    public VarDeclarat getVarDeclarat() {
        return VarDeclarat;
    }

    public void setVarDeclarat(VarDeclarat VarDeclarat) {
        this.VarDeclarat=VarDeclarat;
    }

    public VarDecl getVarDecl() {
        return VarDecl;
    }

    public void setVarDecl(VarDecl VarDecl) {
        this.VarDecl=VarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(VarDeclarat!=null) VarDeclarat.accept(visitor);
        if(VarDecl!=null) VarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(VarDeclarat!=null) VarDeclarat.traverseTopDown(visitor);
        if(VarDecl!=null) VarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(VarDeclarat!=null) VarDeclarat.traverseBottomUp(visitor);
        if(VarDecl!=null) VarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VariableDeclarationss(\n");

        if(VarDeclarat!=null)
            buffer.append(VarDeclarat.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDecl!=null)
            buffer.append(VarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VariableDeclarationss]");
        return buffer.toString();
    }
}
