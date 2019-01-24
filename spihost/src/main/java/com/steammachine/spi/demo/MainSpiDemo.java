package com.steammachine.spi.demo;

import com.steammachine.spi.types.ServiceType;
import java.util.ServiceLoader;
import java.util.stream.StreamSupport;

public class MainSpiDemo {

    private static final ServiceLoader<ServiceType> TYPES =
            ServiceLoader.load(ServiceType.class);


    public static void main(String[] args) {
        StreamSupport.stream(TYPES.spliterator(), true)
                .flatMap(serviceType -> serviceType.providedData().stream())
                .forEach(System.out::println);
    }


}
