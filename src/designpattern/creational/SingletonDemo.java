package designpattern.creational;
class Singleton implements Cloneable{
    public static final Singleton INSTANCE;
    private Singleton(){}
    static {
        INSTANCE = new Singleton();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException("Can not create clone of this class");
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 =  Singleton.INSTANCE;
        print("s1",s1);
        print("s2",s2);
        /*Singleton s3 = (Singleton) s2.clone();
        print("s3",s3);*/
    }

    public static void print(String name, Object obj){
        System.out.println("Instance : "+name+" Hashcode "+obj.hashCode());
    }
}
