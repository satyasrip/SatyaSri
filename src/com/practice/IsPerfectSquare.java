package com.practice;

import java.io.InputStreamReader;
import java.util.Scanner;

public class IsPerfectSquare {
    public static void main(String[] args) {
        System.out.println("Please input a positive integer, I'll test if it is prefect square!");
        Scanner sn = new Scanner(new InputStreamReader(System.in));
        String numberStr = sn.nextLine();
        int number = 0;
        try {
            number = Integer.parseInt(numberStr);
        } catch (Exception ex) {
            System.out.println("Am sorry, Input is not a integer");
        }
        if (number < 0)
            System.out.println(number + " is not a perfect square");

        int root = (int) Math.sqrt(number);


        if (root * root == number)
            System.out.println(number + " is a perfect square with root " + root);
        else
            System.out.println(number + " is not a perfect square");
    }
}
