package com.steammachine.lombok.demo.withlombok;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import lombok.Cleanup;

public class CleanupDemo {

    public static class I {

        final int i;

        public I(int i) {
            this.i = i;
        }

        public static void shutUpStatic() {
            System.out.println("shutUpStatic");
        }
        private static void shutUpStaticPrivate() {
            System.out.println("shutUpStaticPrivate");
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
        @Cleanup("shutdown") I i2 = new I(2);
        @Cleanup("returns") I i3 = new I(3);
        @Cleanup("shutUpStatic") I i4 = new I(3);
        @Cleanup("shutUpStaticPrivate") I i5 = new I(3);
    }


    private static ByteArrayInputStream getStream() {
        return new ByteArrayInputStream(new byte[]{1, 2, 3});
    }

    public static void main(String[] args) throws IOException {
        process();
    }

}
