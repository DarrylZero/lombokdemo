package com.steammachine.lombok.demo.withlombok;

import lombok.Value;

@Value
public class ValueDemo {

    private int i;

    public static void main(String[] args) {
        ValueDemo aValue = new ValueDemo(12);
        System.out.println(aValue);

    }
}
