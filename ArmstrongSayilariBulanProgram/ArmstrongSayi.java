import java.util.Scanner;

public class ArmstrongSayi {

    public static void main(String[] args) {

        int sayi;
        int basamakSayisi =0;
        int basamakDegeri;
        int toplam=0;
        int usAlma;

        Scanner scn = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        sayi = scn.nextInt();
        int geciciSayi = sayi;

        while (geciciSayi != 0){
            geciciSayi /= 10;
            basamakSayisi ++;
        }
        geciciSayi = sayi;

        while (geciciSayi != 0){
            basamakDegeri = geciciSayi%10;
            usAlma=1;

            for(int i =1; i<=basamakSayisi; i++){
                usAlma *=basamakDegeri;
            }
            toplam += usAlma;
            geciciSayi /= 10;
        }
        if(toplam == sayi){
            System.out.println(sayi + " Armstrong Sayidir.");
        }else {
            System.out.println(sayi + " Armstrong Sayi Degildir.");
        }

    }
}
