package com.steammachine.lombok.demo.withlombok;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.var;

public class CleanupDemo {

    public static class I {

        final int i;

        public I(int i) {
            this.i = i;
        }


        void close() {
            System.out.println("close");
        }

        void shutdown() {
            System.out.println("shutdown");
        }

        int returns() {
            System.out.println("returns " + i);
            return 1;
        }

        void process() {
            System.out.println("process " + i);
        }
    }

    public static void process() throws IOException {
        @Cleanup InputStream byteArrayInputStream = getStream();
        @Cleanup("returns") I i = new I(1);
        @Cleanup("returns") I i2 = new I(2);
        @Cleanup("returns") I i3 = new I(3);

        System.out.println("after all usages of i");
    }


    private static ByteArrayInputStream getStream() {
        return new ByteArrayInputStream(new byte[]{1, 2, 3});
    }

    public static void main(String[] args) throws IOException {
        process();
    }

}
