package com.steammachine.lombok.demo;

import org.junit.Test;

public class NonNullDemoTest {

    @Test
    public void test() {
        new NonNullDemo1().data = "17";
        new NonNullDemo1().data = null;
    }

    @Test
    public void test2() {
        new NonNullDemo2().data = "17";
        new NonNullDemo2().data = null;
    }

    @Test
    public void test3() {
        new NonNullDemo3().setData("17");
        new NonNullDemo3().setData(null);
    }

    @Test
    public void test4() {
        new NonNullDemo4(null);
    }

    @Test
    public void test5() {
        NonNullDemo4 nonNullDemo4 = new NonNullDemo4("18");
        nonNullDemo4.setData(null);
    }

    @Test
    public void test6() {
        NonNullDemo4 nonNullDemo4 = new NonNullDemo4("18");
        nonNullDemo4.setData2(null);
    }

    @Test
    public void test7() {
        NonNullDemo5 nonNullDemo5 = new NonNullDemo5();
        nonNullDemo5.setData(null);
    }



}
