package designpattern.creational;

import java.io.*;


public class SingletonDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonEnum s1 = SingletonEnum.INSTANCE;

        SingletonEnum s2 = SingletonEnum.INSTANCE;
        print("s1",s1);
        print("s2",s2);
    }

    public static void print(String name, Object obj){
        System.out.println("Instance : "+name+" Hashcode "+obj.hashCode());
    }
}
