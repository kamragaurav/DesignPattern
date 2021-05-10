package designpattern.creational;

import java.io.*;

class Singleton implements Serializable{
    private static Singleton INSTANCE;
    private Singleton(){}
    public static Singleton getInstance(){
       if(INSTANCE==null){
           INSTANCE=new Singleton();
       }
       return INSTANCE;
    }

    protected Object readResolve(){
        return INSTANCE;
    }

}
public class SingletonDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton s1 = Singleton.getInstance();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("s1.ser"));
        outputStream.writeObject(s1);
        InputStream in;
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("s1.ser"));
        Singleton s2 = (Singleton) inputStream.readObject();
        print("s1",s1);
        print("s2",s2);
    }

    public static void print(String name, Object obj){
        System.out.println("Instance : "+name+" Hashcode "+obj.hashCode());
    }
}
