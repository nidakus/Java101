import java.util.Scanner;

public class HarmonikSayi {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("N Sayisini Giriniz: ");
        int n = scn.nextInt();
        double toplam = 0.0;

        for(double i=1; i<=n; i++){

            toplam += (1/i);
        }
        System.out.println("Toplam: " + toplam);
    }
}
