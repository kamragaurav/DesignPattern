package designpattern.creational;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singleton implements Cloneable{
    public static volatile Singleton INSTANCE;
    private Singleton(){}
    public static Singleton getInstance(){
        if(INSTANCE==null){
            synchronized (Singleton.class) {
                if(INSTANCE==null)
                INSTANCE = new Singleton();
            }
        }
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException("Can not create clone of this class");
    }
}
public class SingletonDemo {
    static  void useSingleton(){
        Singleton s1 = Singleton.getInstance();
        print("s1",s1);
    }
    public static void main(String[] args) {
        //Singleton s1 = Singleton.INSTANCE;
        //Singleton s2 =  Singleton.INSTANCE;
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(SingletonDemo::useSingleton);
        service.submit(SingletonDemo::useSingleton);
        service.submit(SingletonDemo::useSingleton);
        service.shutdown();
        //print("s1",s1);
        //print("s2",s2);
    }

    public static void print(String name, Object obj){
        System.out.println("Instance : "+name+" Hashcode "+obj.hashCode());
    }
}
