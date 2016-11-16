package com.jemilox.helloworld;

/**
 * Created by lisacook on 11/14/16.
 */

public class HelloWorldApp {
    public static void main(String[] args) {
        String lisa = args[0];
        String a = "42";
        String b = "42";

        boolean sameObject = a == b;
        boolean reallyEquals = a.equals(b);

        HelloWorld helloWorld = new HelloWorld();

        if (lisa.equals("mewo")) {
            helloWorld.sayHello();
        } else {
            System.out.println("meow!");
        }
    }
}
