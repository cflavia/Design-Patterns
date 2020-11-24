package test;

import java.util.ArrayList;

public class Product implements Element {
    protected String name;
    protected int price;
    protected Phone phone;
    protected ArrayList<Element> content = new ArrayList<>();
    Product(String name, int price){
        this.price=price;
        this.name=name;
    }
    public void print(){
        System.out.println("Produs: "+this.name+ " la pretul: "+this.price);
        for(Element i : content){
            i.print();
        }
    }
    public Element getElement(int index){
        return content.get(index);
    }
    public int add(Element elm){
        content.add(elm);
        return content.indexOf(elm);
    }
    public void remove(Element elm){
        content.remove(elm);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Element i : content){
           i.accept(visitor);
        }
    }

    public void setPhone(Phone p) {
        this.phone = p;
    }
}
