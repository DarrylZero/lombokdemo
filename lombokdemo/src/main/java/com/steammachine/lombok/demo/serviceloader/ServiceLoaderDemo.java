package com.steammachine.lombok.demo.serviceloader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public class ServiceLoaderDemo {

    public interface SomeServiceInterface {

        String getSomething();

    }

    public static void main(String[] args) {
        ServiceLoader<SomeServiceInterface> serviceLoader =
                ServiceLoader.load(SomeServiceInterface.class);


        Iterator<SomeServiceInterface> iterator = serviceLoader.iterator();
        List<String> strings = new ArrayList<>();
        for (;iterator.hasNext();) {
            strings.add(iterator.next().getSomething());
        }
    }


}
