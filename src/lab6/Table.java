package lab6;

import java.util.ArrayList;

public class Table implements Element,Visitee {
    private String name;
    Table(String name){
        this.name=name;
    }
    public void print(){
        System.out.println("Table with name: "+this.name);
    }
    public void accept(BookStatistics stats) {
        stats.visit(this);
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
