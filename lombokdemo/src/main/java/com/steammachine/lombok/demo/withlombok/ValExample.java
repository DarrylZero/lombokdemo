package com.steammachine.lombok.demo.withlombok;

import java.util.ArrayList;
import lombok.val;

public class ValExample {

    public static String example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        return foo.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(example());
    }
}
