package test;

public class Charger implements Element,Visitee{
    protected String name;
    protected int price;
    public Charger(String name, int price){
        this.name=name;
        this.price=price;
    }
    public void print(){
        System.out.println("Changer:"+ this.name+" price: "+this.price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void accept(Statistics visitor) {
        visitor.visit(this);
    }
    public void render(String p) {
        System.out.println("Changer"+ this.name+" price: "+this.price);
    }
}
