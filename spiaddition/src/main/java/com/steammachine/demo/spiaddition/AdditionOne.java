package com.steammachine.demo.spiaddition;

import com.steammachine.spi.types.ServiceType;
import java.util.Arrays;
import java.util.List;

/**
 *  {@link com.steammachine.demo.spiaddition.AdditionOne}
 */
public class AdditionOne implements ServiceType {

    private static final List<String> STRINGS = Arrays.asList("1", "2", "3");

    @Override
    public List<String> providedData() {
        return STRINGS;
    }
}
