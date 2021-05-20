package designpattern.creational.factorymethoddesignpattern;

public class Apple extends Laptop {
    private String ram;
    private String processor;

    public Apple(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getConfiguration() {
        return "Mac Laptop ram is : "+this.ram+" and processor is : "+this.processor;
    }

}
