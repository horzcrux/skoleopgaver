package uge1;
import java.util.Scanner;

public class Mindste_tal {


    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        Double a = s.nextDouble();
        Double b = s.nextDouble();
        Double c = s.nextDouble();

        if(a<b && a<c){
            System.out.println(a);
        } else if((b<a || b.equals(a)) && b<c){
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
