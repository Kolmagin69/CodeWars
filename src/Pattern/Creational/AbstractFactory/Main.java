package Pattern.Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        CarsFactory toyotaFactory = new ToyotaFactory();
        CarsFactory fordFactory = new FordFactory();
        Sedan sedan = toyotaFactory.createSedan();
        sedan.sedan();
    }
}
