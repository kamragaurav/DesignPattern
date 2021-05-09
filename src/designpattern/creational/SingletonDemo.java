package designpattern.creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singleton {

    public static volatile Singleton INSTANCE;
    private Singleton(){
        if(INSTANCE!=null)
            throw new UnsupportedOperationException("Can not create constructor");
    }

    public static Singleton getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }


}
public class SingletonDemo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
       // Class aClass = Class.forName("designpattern.creational.Singleton");
        //Constructor<Singleton>[] constructor = aClass.getDeclaredConstructors();
        Object[] parameters = new Object[3];
        Singleton instance = Singleton.getInstance();
        print("s1",instance);
        Singleton instance2;
        Constructor constructors =
                Singleton.class.getDeclaredConstructors()[0];
        //for (Constructor constructor : constructors)
        //{
            // Below code will destroy the singleton pattern
            constructors.setAccessible(true);
            instance2 = (Singleton) constructors.newInstance(null);

            print("s",instance2);

          //  break;
        //}





    }

    public static void print(String name, Object obj){
        System.out.println("Instance : "+name+" Hashcode "+obj.hashCode());
    }
}
