package test;

import lab6.Visitor;

import java.util.ArrayList;

public class Box implements Element{
    private String name;
    private ArrayList<Element> content = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    Box(String name){
        this.name=name;
    }
    public void addContent(Element elm){
        content.add(elm);
    }
    public void addProduct(Product product){
        products.add(product);
    }
    private void printProducts(){
        for (Product i: products){
            i.print();
        }
    }
    public void print(){
        System.out.println("Box: "+this.name);
        printProducts();
        for(Element i:content){
            i.print();
        }
    }

    @Override
    public void accept(test.Visitor visitor) {
        visitor.visit(this);
        for(Element i : content){
            i.accept((test.Visitor) visitor);
        }
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Element i : content){
            i.accept((test.Visitor) visitor);
        }
    }
}
