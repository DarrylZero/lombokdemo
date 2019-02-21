package com.steammachine.lombok.demo;

import lombok.NonNull;

public class NonNullDemo3 {

    @NonNull
    private String data;

    public String getData() {
        return data;
    }

    public void setData(@NonNull String data) {
        this.data = data;
    }
}
