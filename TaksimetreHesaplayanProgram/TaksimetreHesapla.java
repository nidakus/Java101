import java.util.Scanner;

public class TaksimetreHesapla {

    public static void main(String[] args) {

        double km, perKm = 6, total, startPrice = 6.5;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Kac KM Gidildi Yaziniz: ");
        km = girdi.nextDouble();

        total = (km * perKm);
        total += startPrice;
        total = (total<18)? total = 18 : total;
        System.out.println("Ucret: " + total + " TL");
    }
}
