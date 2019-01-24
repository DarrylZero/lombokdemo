package com.steammachine.lombok.demo;

import static org.hamcrest.CoreMatchers.is;

import com.steammachine.lombok.demo.withlombok.PojoLombok;
import com.steammachine.lombok.demo.withlombok.PojoLombokToString;
import com.steammachine.lombok.demo.nolombok.Pojo;
import org.junit.Assert;
import org.junit.Test;

public class PojoTest {

    @Test
    public void test() {
        Pojo pojo = new Pojo();
        pojo.setId(11);

        PojoLombok pojoLombok = new PojoLombok();
        pojoLombok.setId(11);
    }


    /**
     *  #STEP 2 simple example with
     *
     *  {@link PojoLombokToString#toString()}
     */
    @Test
    public void testToString() {
        PojoLombokToString pojo = new PojoLombokToString();
        pojo.id = 11;
        Assert.assertThat(pojo.toString(), is("PojoLombokToString(id=11)"));


        PojoLombok pojoLombok = new PojoLombok();
        pojoLombok.setId(11);
    }

}