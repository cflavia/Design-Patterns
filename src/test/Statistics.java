package test;

public class Statistics implements Visitor{
    private int telefon=0;
    private int chargers=0;
    private int headphones=0;
    private int products=0;

    public Statistics() {
    }

    @Override
    public void visit(WindowsPhone windowsPhone) {
        telefon+=windowsPhone.price;
    }

    @Override
    public void visit(Android android) {
        telefon+=android.price;
    }

    @Override
    public void visit(IoS ioS) {
        telefon+=ioS.price;
    }

    @Override
    public void visit(Product product) {
        products+=product.price;
    }

    @Override
    public void visit(HeadPhones h) {
        headphones+=h.price;
    }

    @Override
    public void visit(Charger charger) {
        chargers += charger.price;
    }

    @Override
    public void visit(Box box) {

    }

    public void printStatistics(){
        System.out.println("Statistics: ");
        System.out.println("Price phones: "+telefon);
        System.out.println("Price charger: "+ chargers);
        System.out.println("Price headphones: "+headphones);
        System.out.println("Price products: "+headphones);
    }
}
