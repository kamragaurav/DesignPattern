package designpattern.creational.factorymethoddesignpattern;

public class LenovoLinux extends Laptop {
    private String ram;
    private String processor;

    public LenovoLinux(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public String getConfiguration() {
        return "Lenovo Laptop ram is : "+this.ram+" and processor is : "+this.processor;
    }


}
