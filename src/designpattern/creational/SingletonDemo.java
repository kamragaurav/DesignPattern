package designpattern.creational;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singleton {

    private Singleton(){}

    private static class InstanceHolder{
        public static volatile Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance(){
        return InstanceHolder.INSTANCE;
    }
}
public class SingletonDemo {
    static  void useSingleton(){
        Singleton s1 = Singleton.getInstance();
        print("s1",s1);
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(SingletonDemo::useSingleton);
        service.submit(SingletonDemo::useSingleton);
        service.submit(SingletonDemo::useSingleton);
        service.shutdown();
    }

    public static void print(String name, Object obj){
        System.out.println("Instance : "+name+" Hashcode "+obj.hashCode());
    }
}
