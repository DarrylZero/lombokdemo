package com.steammachine.lombok.demo;

import com.sun.istack.internal.NotNull;
import lombok.NonNull;

public class NonNullDemo5 {
    private String data;
    public void setData(@NonNull String data) {
        this.data = data;
    }


    public static void main(String[] args) {
        @NotNull String str = (String) getObject();
        System.out.println(str);
    }

    private static Object getObject() {
        return null;
    }
}
