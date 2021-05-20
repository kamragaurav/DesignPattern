package designpattern.creational.factorymethoddesignpattern;



public class HPLaptopFactory extends LaptopFactory {
    @Override
    public Laptop getLaptop() {
        return new HP("12","intel i5");
    }

    public static LaptopFactory getInstance(){
        return  new HPLaptopFactory();
    }
}
