package com.steammachine.lombok.demo;

import java.io.IOException;
import lombok.SneakyThrows;

public class SneakyThrowsDemo {


    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            @SneakyThrows
            public void run() {
                throw new IOException();
            }
        }).start();
    }

}
