package yakittutari;

import java.util.Scanner;

public class YakitTutari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kurus;
        int km;
        double tutar;

        System.out.println("aracanız kaç kuruş yakmaktadır ? (örnek = 0.32 kuruş) : ");
        kurus = input.nextDouble();

        System.out.println("aracınız ile kaç kilometre yol alacaksınız ? ; ");
        km = input.nextInt();

        tutar = kurus * km;
        System.out.println("ödeme yapmanız gereken toplam tutar : " + tutar + " lira");
    
    }

}
