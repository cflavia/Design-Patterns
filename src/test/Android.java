package test;

public class Android implements Element,Visitee, Phone {
    protected String name;
    protected int price;
    private Phone phone;
    public Android(String name, int price){
        this.name=name;
        this.price=price;
    }
    public void setPhone(Phone a){
        this.phone = a;
    }
    public void print(){
        if (phone == null) {
            System.out.println("@Android:"+ this.name+" price: "+this.price);
        }
        else {
            phone.render(this.name);
        }
    }
    public void accept(Statistics stats) {
        stats.visit(this);
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void render(String p) {
        System.out.println("@Android"+ this.name+" price: "+this.price);
    }
}

