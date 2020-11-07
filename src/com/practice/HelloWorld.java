package com.practice;

import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner sn = new Scanner(new InputStreamReader(System.in));
        System.out.println("Welcome, May I know your name?");
        String name = sn.nextLine();
        System.out.println("Hello, "+name+" !!");

    }
}
