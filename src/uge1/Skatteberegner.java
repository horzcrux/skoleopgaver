package uge1;

public class Skatteberegner {

    public static void main(String[] args){
        int indkomst = 120000;
        int personafdrag = 33400;
        double ambi, pension, bundskat;

        ambi = indkomst * 8.0 / 100.0;
        pension = indkomst * 1.0 / 100.0;
        bundskat=(indkomst-ambi-pension-personafdrag)*7/100;

        System.out.print("Arbejdsmarkedsbidrag: ");
        System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        System.out.print("Bundskat: ");
        System.out.println(bundskat);

    }
}
