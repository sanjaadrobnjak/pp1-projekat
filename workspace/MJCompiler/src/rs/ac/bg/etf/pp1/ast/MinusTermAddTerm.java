// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class MinusTermAddTerm extends Expr {

    private MinusMaybeTerm MinusMaybeTerm;
    private AddTermList AddTermList;

    public MinusTermAddTerm (MinusMaybeTerm MinusMaybeTerm, AddTermList AddTermList) {
        this.MinusMaybeTerm=MinusMaybeTerm;
        if(MinusMaybeTerm!=null) MinusMaybeTerm.setParent(this);
        this.AddTermList=AddTermList;
        if(AddTermList!=null) AddTermList.setParent(this);
    }

    public MinusMaybeTerm getMinusMaybeTerm() {
        return MinusMaybeTerm;
    }

    public void setMinusMaybeTerm(MinusMaybeTerm MinusMaybeTerm) {
        this.MinusMaybeTerm=MinusMaybeTerm;
    }

    public AddTermList getAddTermList() {
        return AddTermList;
    }

    public void setAddTermList(AddTermList AddTermList) {
        this.AddTermList=AddTermList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MinusMaybeTerm!=null) MinusMaybeTerm.accept(visitor);
        if(AddTermList!=null) AddTermList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MinusMaybeTerm!=null) MinusMaybeTerm.traverseTopDown(visitor);
        if(AddTermList!=null) AddTermList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MinusMaybeTerm!=null) MinusMaybeTerm.traverseBottomUp(visitor);
        if(AddTermList!=null) AddTermList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MinusTermAddTerm(\n");

        if(MinusMaybeTerm!=null)
            buffer.append(MinusMaybeTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(AddTermList!=null)
            buffer.append(AddTermList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MinusTermAddTerm]");
        return buffer.toString();
    }
}
