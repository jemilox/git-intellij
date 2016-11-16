package com.jemilox.helloworld;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisacook on 11/14/16.
 */
public class HelloWorld {
    private int methodName() {
        return 42;
    }

    public void sayHello() {
        List<String> maStrings = new ArrayList<String>();
        maStrings.add("HEY THERE");
        maStrings.add("I LIKE " + methodName());
        for (String string : maStrings) {
            System.out.println(string);
        }
    }

    public static String mew() {
        return "mew";
    }
}
