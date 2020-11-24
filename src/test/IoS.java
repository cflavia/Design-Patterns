package test;

public class IoS implements Element,Visitee, Phone{
    protected String name;
    protected int price;
    private Phone phone;
    public IoS(String name, int price){
        this.name=name;
        this.price=price;
    }
    public void setPhone(Phone a){
        this.phone = a;
    }
    public void print(){
        if (phone == null) {
            System.out.println("@IoS:"+ this.name+" price: "+this.price);
        }
        else {
            phone.render(this.name);
        }
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
        System.out.println("@IoS"+ this.name+" price: "+this.price);
    }
}
