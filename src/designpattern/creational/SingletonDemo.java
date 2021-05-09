package designpattern.creational;
class Singleton{
    private static Singleton INSTANCE;
    private Singleton(){}
    public static Singleton getInstance(){
       if(INSTANCE==null){
           INSTANCE=new Singleton();
       }
       return INSTANCE;
    }
}
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 =  Singleton.getInstance();
        print("s1",s1);
        print("s2",s2);
    }

    public static void print(String name, Object obj){
        System.out.println("Instance : "+name+" Hashcode "+obj.hashCode());
    }
}
