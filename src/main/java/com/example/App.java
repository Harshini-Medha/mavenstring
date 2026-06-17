package com.example;

import com.google.common.collect.ImmutableList;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        ImmutableList<String> fruits =
                ImmutableList.of("Apple", "Banana", "Cherry");

        System.out.println(fruits);

        File sourceFile = new File("source.txt");
        File destinationFile = new File("destination.txt");

        try {
            FileUtils.copyFile(sourceFile, destinationFile);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
