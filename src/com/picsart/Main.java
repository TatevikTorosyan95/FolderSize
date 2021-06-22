package com.picsart;

import com.picsart.Model.Counter;

import java.io.File;

public class Main {
    public static void main(String args[]) {
        File file = new File("");
        Counter.count(file);
    }
}
