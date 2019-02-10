package com.steammachine.lombok.demo.withlombok;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import lombok.val;

public class ValDemo {

    public static void main(String[] args)
            throws IOException {
        byte[] bytes = new byte[1];
        val stream = new ByteArrayInputStream(new byte[]{122, 122, 122});
        try {
            stream.read(bytes);
        } finally {
            stream.close();
        }
        // stream = null;
    }

}
