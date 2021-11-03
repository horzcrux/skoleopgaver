package uge2;

import java.util.Scanner;

public class Konvertering_af_tid {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int input, secs, days, hours, minutes;
        input = scan.nextInt();
        secs=input;

        scan.close();

        days = secs/(24*60*60);
        secs = secs%(24*60*60);

        hours = secs/(60*60);
        secs = secs%(60*60);

        minutes = secs/(60);
        secs = secs%(60);

        System.out.println(input+" seconds equals "+days+" days, "+hours+" hours, "+minutes+" minutes and "+secs+" seconds.");
    }
}
