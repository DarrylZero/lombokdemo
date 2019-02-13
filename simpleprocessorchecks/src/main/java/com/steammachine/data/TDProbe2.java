package com.steammachine.data;

import com.staemmachine.annotationprocessors.spicollector.InterfaceToSupport;
import com.staemmachine.annotationprocessors.spicollector.annotionons.Collected;
import com.staemmachine.annotationprocessors.techdebt.annotations.TechnicalDebt;

@TechnicalDebt(value = "21.02.2022")
public class TDProbe2 {


    private static class Data implements InterfaceToSupport {

        @Override
        public void methodToCall() {

        }
    }


    @Collected
    public static InterfaceToSupport data3() {
        return new Data();
    }

    @Collected
    public static InterfaceToSupport data() {
        return new InterfaceToSupport() {
            @Override
            public void methodToCall() {

            }
        };
    }

    @Collected
    public static InterfaceToSupport data2() {
        return new Data();
    }

    @Collected
    public void data4() {

    }


}
