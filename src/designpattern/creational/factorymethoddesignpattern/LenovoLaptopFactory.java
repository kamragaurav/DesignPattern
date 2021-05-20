package designpattern.creational.factorymethoddesignpattern;



public class LenovoLaptopFactory extends LaptopFactory {

    @Override
    public Laptop getLaptop() {
        return new Lenovo("12", "Ryzen");
    }

    public static LaptopFactory getInstance(){
        return  new LenovoLaptopFactory();
    }
}
