package designpattern.creational.factory;

public class LaptopFactory {
    public static Laptop getLaptop(LaptopType laptopType){
        switch (laptopType){
            case HP:return new HP("16","Ryzen5");
            case APPLE:return new Apple("32","Ryzen7");
            case LENOVO:return new Lenovo("8","intel i5");
            default:return null;
        }
    }
}
