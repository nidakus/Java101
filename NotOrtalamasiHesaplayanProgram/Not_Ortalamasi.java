import java.util.Scanner;

public class Not_Ortalamasi {

    public static void main(String[] args) {


        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        System.out.print("Notlarinizin Ortalamasi:");
        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double sonuc = toplam/6;
        System.out.println(sonuc);
        String str = sonuc >= 60 ? "Sinifi Gecti" : "Sinifta Kaldi" ;
        System.out.println(str);

    }
}
