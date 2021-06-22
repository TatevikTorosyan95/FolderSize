package com.picsart.Model;

import java.io.File;

public class Counter {
    public static long length = 0;
    public static long count(File file) {

        if (file != null && file.exists()) {
            if (file.isFile()) {
                    length += file.length();
                System.out.println(length + " bytes");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                for (File f : file.listFiles()) {
                    count(f);
                }
            }
        }
        return length;
    }


}