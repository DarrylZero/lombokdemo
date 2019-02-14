package com.steammachine.lombok.demo.withlombok;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import lombok.Cleanup;
import lombok.SneakyThrows;

public class SneakyThrowsDemo {


    public static void processWithoutSneakyThrows() throws IOException {
        @Cleanup InputStream stream = getStream();
        byte[] buffer = new byte[2];
        stream.read(buffer);
    }

    @SneakyThrows
    public static void process() {
        @Cleanup InputStream stream = getStream();
        byte[] buffer = new byte[2];
        stream.read(buffer);
    }

    @SneakyThrows({UnsupportedEncodingException.class})
    public static String process(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    private static ByteArrayInputStream getStream()
            throws IOException, UnsupportedEncodingException {
        return new ByteArrayInputStream(new byte[]{1, 2, 3});
    }

    public static void main(String[] args) {
        System.out.println(process(new byte[]{119, 122, 120}));
    }





}
