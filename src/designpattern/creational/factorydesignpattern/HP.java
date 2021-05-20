package designpattern.creational.factorydesignpattern;

public class HP extends Laptop {
    private String ram;
    private String processor;

    public HP(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public String getConfiguration() {
        return "HP Laptop ram is : "+this.ram+" and processor is : "+this.processor;
    }
}
