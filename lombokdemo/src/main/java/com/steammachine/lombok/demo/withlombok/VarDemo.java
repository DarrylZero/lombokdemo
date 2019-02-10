package com.steammachine.lombok.demo.withlombok;

import lombok.var;

public class VarDemo {

    public static void main(String[] args) {
        var d = 17.0;
        while ((d-=0.465) > 0) {
            System.out.println(". " + d);
        }
    }

}
