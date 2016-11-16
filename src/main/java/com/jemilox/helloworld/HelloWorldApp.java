package com.jemilox.helloworld;

/**
 * Created by lisacook on 11/14/16.
 */

public class HelloWorldApp {
    public static void main(String[] args) {
        String lisa = "mew";



        HelloWorld helloWorld = new HelloWorld();


        if(lisa == "mewo"){
            helloWorld.sayHello();
        }else{
            System.out.println("meow!");
        }
    }
}
