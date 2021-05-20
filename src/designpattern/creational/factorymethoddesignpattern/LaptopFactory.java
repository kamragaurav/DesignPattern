package designpattern.creational.factorymethoddesignpattern;



public abstract class LaptopFactory {
    public abstract  Laptop getLaptop();
    public void printLaptopDiscriptions(){
        Laptop laptop = getLaptop();
        System.out.println(laptop.getConfiguration());
    }
}
