package com.picsart;

import com.picsart.Model.Counter;

import java.io.File;

public class Main {
    public static void main(String args[]) {
        File file = new File("C:\\Users\\user\\IdeaProjects\\PicsArt");
        Counter.count(file);
    }
}
