import java.util.Scanner;

public class BasamakSayilariniTopla {

    public static void main(String[] args) {

        int sayi;
        int rakam ;
        int toplam =0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        sayi = inp.nextInt();

        while (sayi !=0){

            rakam = sayi%10;
            System.out.println(rakam);
            toplam += rakam;
            sayi /= 10;
        }
        System.out.println("Rakamlar Toplami: " + toplam);
    }
}
