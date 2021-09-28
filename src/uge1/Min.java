package uge1;

import java.util.Scanner;

public class Min {

    public static double min(double a, double b, double c){

        return Math.min(Math.min(a,b),c);
    }

    public static void main(String[] args) {

        System.out.println(Min.min(5, 100, 2));
    }
}
