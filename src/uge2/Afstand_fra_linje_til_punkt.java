package uge2;

import java.util.Scanner;

public class Afstand_fra_linje_til_punkt {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        Double x0 = scan.nextDouble();
        Double y0 = scan.nextDouble();

        scan.close();

        double dist =Math.abs(a*x0+b-y0)/Math.sqrt(a*a+1);

        System.out.println(dist);

    }
}
