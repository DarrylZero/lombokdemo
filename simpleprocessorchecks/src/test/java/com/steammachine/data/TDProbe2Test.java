package com.steammachine.data;

import static org.junit.Assert.*;

import java.lang.annotation.Inherited;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

@AnAnnotation(value = TDProbe2Test.class)
public class TDProbe2Test {

    @ClassRule
    public static TestRule object = new TestRule() {
        @Override
        public Statement apply(Statement base, Description description) {
            return base;
        }
    };

    @ClassRule
    public static TestRule object2 = new TestRule() {
        @Override
        public Statement apply(Statement base, Description description) {
            return base;
        }
    };

    @BeforeClass
    public static void beforeClass() {
        //
    }

    @Test
    public void data3() throws Exception {


    }

}