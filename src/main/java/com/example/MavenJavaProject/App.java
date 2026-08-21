package com.example.MavenJavaProject;

import java.io.InputStream;

public class App {

    public static void main(String[] args) {

        // Existing program
        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Sum: " + sum);

        // Load config.properties from src/main/resources
        try {
            InputStream input = App.class.getClassLoader()
                    .getResourceAsStream("config.properties");

            if (input != null) {
                System.out.println("config.properties loaded successfully");
                input.close();
            } else {
                System.out.println("config.properties not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}