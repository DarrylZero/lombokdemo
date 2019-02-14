package com.steammachine.data;

<<<<<<< HEAD
import com.staemmachine.annotationprocessors.spicollector.annotionons.Collected;
import com.staemmachine.annotationprocessors.techdebt.annotations.TechnicalDebt;

@TechnicalDebt(value = "01.02.2020")
@Collected
public class TDProbe2 {
=======
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


>>>>>>> 6f62336d7fb8c4b309e4e087e6b44bd22162311b
}
