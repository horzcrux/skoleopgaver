package uge2;

import java.util.Scanner;

public class Check_af_password {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        String password;
        int length;
        password = scan.nextLine();

        length=password.length( );

        if (length<5){
            System.out.println("Password for kort");
        } else if (length>8) {
            System.out.println("Password for langt");
        } else {
            System.out.println("Password tilpas");
        }
        scan.close();

    }

}
