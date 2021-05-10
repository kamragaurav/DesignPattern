package designpattern.creational.factory;

public class Lenovo extends Laptop {
    private String ram;
    private String processor;

    public Lenovo(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public String getConfiguration() {
        return "Lenovo Laptop ram is : "+this.ram+" and processor is : "+this.processor;
    }
}
