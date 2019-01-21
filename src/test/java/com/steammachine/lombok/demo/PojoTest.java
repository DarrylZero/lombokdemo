package com.steammachine.lombok.demo;

import com.steammachine.lombok.demo.nolombok.PojoLombok;
import com.steammachine.lombok.demo.withlombok.Pojo;
import org.junit.Test;

public class PojoTest {

    @Test
    public void test() {
        Pojo pojo = new Pojo();
        pojo.setId(11);

        PojoLombok pojoLombok = new PojoLombok();
        pojoLombok.setId(11);
    }

}