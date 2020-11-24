package test;


public class Main {

    public static void main(String[] args) throws Exception {
        Box b=new Box("Box");
        Box b1=new Box("Box1");
        Product p=new Product("Telefoane",100);
        Product p1 = new Product("Charger",200);
        Product p3=new Product("Headphones",300);
        b.addContent(p);
        b.addContent(p1);
        b.addContent(b1);
        HeadPhones h1=new HeadPhones("X",100);
        p.add(h1);
        p1.setPhone(new Android("S10",1000));
        p3.setPhone(new Android("S12",1000));
        Android a = new Android("Samsung",1000);
        Charger charger= new Charger("N11",10);
        p.add(charger);
        p.add(a);
        p.add(new IoS("Iphone11",4200));
        p.add(new WindowsPhone("Win",100));
        b.print();
        Statistics stats = new Statistics();
        b.accept(stats);
        stats.printStatistics();
    }
}
