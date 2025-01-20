// generated with ast extension for cup
// version 0.8
// 20/0/2025 14:13:35


package rs.ac.bg.etf.pp1.ast;

public class AddopTerm extends AddTermList {

    private AddTermList AddTermList;
    private Addop Addop;
    private MinusMaybeTerm MinusMaybeTerm;

    public AddopTerm (AddTermList AddTermList, Addop Addop, MinusMaybeTerm MinusMaybeTerm) {
        this.AddTermList=AddTermList;
        if(AddTermList!=null) AddTermList.setParent(this);
        this.Addop=Addop;
        if(Addop!=null) Addop.setParent(this);
        this.MinusMaybeTerm=MinusMaybeTerm;
        if(MinusMaybeTerm!=null) MinusMaybeTerm.setParent(this);
    }

    public AddTermList getAddTermList() {
        return AddTermList;
    }

    public void setAddTermList(AddTermList AddTermList) {
        this.AddTermList=AddTermList;
    }

    public Addop getAddop() {
        return Addop;
    }

    public void setAddop(Addop Addop) {
        this.Addop=Addop;
    }

    public MinusMaybeTerm getMinusMaybeTerm() {
        return MinusMaybeTerm;
    }

    public void setMinusMaybeTerm(MinusMaybeTerm MinusMaybeTerm) {
        this.MinusMaybeTerm=MinusMaybeTerm;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(AddTermList!=null) AddTermList.accept(visitor);
        if(Addop!=null) Addop.accept(visitor);
        if(MinusMaybeTerm!=null) MinusMaybeTerm.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AddTermList!=null) AddTermList.traverseTopDown(visitor);
        if(Addop!=null) Addop.traverseTopDown(visitor);
        if(MinusMaybeTerm!=null) MinusMaybeTerm.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AddTermList!=null) AddTermList.traverseBottomUp(visitor);
        if(Addop!=null) Addop.traverseBottomUp(visitor);
        if(MinusMaybeTerm!=null) MinusMaybeTerm.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AddopTerm(\n");

        if(AddTermList!=null)
            buffer.append(AddTermList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Addop!=null)
            buffer.append(Addop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MinusMaybeTerm!=null)
            buffer.append(MinusMaybeTerm.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AddopTerm]");
        return buffer.toString();
    }
}
