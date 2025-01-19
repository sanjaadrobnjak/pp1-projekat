// generated with ast extension for cup
// version 0.8
// 19/0/2025 16:26:36


package rs.ac.bg.etf.pp1.ast;

public class MinusTermAddTerm extends Expr {

    private MinusMaybe MinusMaybe;
    private Term Term;
    private AddTermList AddTermList;

    public MinusTermAddTerm (MinusMaybe MinusMaybe, Term Term, AddTermList AddTermList) {
        this.MinusMaybe=MinusMaybe;
        if(MinusMaybe!=null) MinusMaybe.setParent(this);
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
        this.AddTermList=AddTermList;
        if(AddTermList!=null) AddTermList.setParent(this);
    }

    public MinusMaybe getMinusMaybe() {
        return MinusMaybe;
    }

    public void setMinusMaybe(MinusMaybe MinusMaybe) {
        this.MinusMaybe=MinusMaybe;
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
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
        if(MinusMaybe!=null) MinusMaybe.accept(visitor);
        if(Term!=null) Term.accept(visitor);
        if(AddTermList!=null) AddTermList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MinusMaybe!=null) MinusMaybe.traverseTopDown(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
        if(AddTermList!=null) AddTermList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MinusMaybe!=null) MinusMaybe.traverseBottomUp(visitor);
        if(Term!=null) Term.traverseBottomUp(visitor);
        if(AddTermList!=null) AddTermList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MinusTermAddTerm(\n");

        if(MinusMaybe!=null)
            buffer.append(MinusMaybe.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
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
