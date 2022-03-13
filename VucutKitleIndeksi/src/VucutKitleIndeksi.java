import java.util.Scanner;

public class VucutKitleIndeksi {

    public static void main(String[] args) {

        double boy, indeks;
        int kilo;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextInt();

        indeks = kilo/(boy*boy);
        System.out.print("Vucut Kitle Indeksiniz: "+indeks);
    }
}
