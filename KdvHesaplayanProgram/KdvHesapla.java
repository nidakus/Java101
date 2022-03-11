import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {

        double fiyat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fiyat Giriniz: ");
        fiyat = inp.nextDouble();
        System.out.println("Kdv'siz Fiyat : "+ fiyat +" tl");

        double kdvTutari =  fiyat<=1000 ? fiyat * 0.18: fiyat*0.08;

        System.out.println("Kdv'li Fiyat : " + (kdvTutari+fiyat) +" tl");

        System.out.println("Kdv Tutari : "+ kdvTutari +" tl");
    }
}
