package designpattern.creational.factorymethoddesignpattern;



public class Client {
    public static void main(String[] args) {
        LenovoLaptopFactory.getInstance().printLaptopDiscriptions();
        HPLaptopFactory.getInstance().printLaptopDiscriptions();
    }
}
