package designpattern.creational.factorydesignpattern;

public class Client {
    public static void main(String[] args) {
        Laptop hp = LaptopFactory.getLaptop(LaptopType.HP);
        if(hp!=null)hp.getConfiguration();
        Laptop lenovo = LaptopFactory.getLaptop(LaptopType.LENOVO);
        if(lenovo!=null)lenovo.getConfiguration();
        Laptop apple = LaptopFactory.getLaptop(LaptopType.APPLE);
        if(apple!=null) apple.getConfiguration();
    }
}
