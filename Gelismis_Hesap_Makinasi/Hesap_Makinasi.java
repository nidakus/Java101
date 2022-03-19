import java.util.Scanner;

public class Hesap_Makinasi {

    static int toplam(int a,int b){
        int sonuc = a + b;
        System.out.println("Toplam : " + sonuc);
        return sonuc;
    }
    static int cikarma(int a,int b){
        int sonuc = a - b;
        System.out.println("Cikan : " + sonuc);
        return sonuc;
    }
    static int carpma(int a,int b){
        int sonuc = a * b;
        System.out.println("Carpim : " + sonuc);
        return sonuc;
    }
    static int bolme(int a,int b){
        if(b == 0){
            System.out.println("Sayi sifira bolunemez! Tekrar deneyin.");
            return 0;
        }
        int sonuc = a / b;
        System.out.println("Bolum : " + sonuc);
        return sonuc;
    }
    static int usAlma(int a, int b){
        int sonuc = 1;
        for(int i=1; i<=b; i++){
            sonuc *= a;
        }
        System.out.println("Us hesabi: " + sonuc);
        return sonuc;
    }
    static int modAlma(int a,int b){
        int sonuc = a % b;
        System.out.println("Mod :" + sonuc);
        return sonuc;
    }
    static void diktortgen(int a,int b){
        System.out.println("Dikdortgen Cevresi: "+ (2*(a+b)));
        System.out.println("Dikdortgenin alani: " + a*b);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int secim;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while (true) {
            System.out.print("Yapmak istediginiz islemi seciniz: ");
            secim = inp.nextInt();

            if(secim == 0){
                System.out.println("Iyi Gunler..");
                break;
            }
            System.out.print("Ilk sayi:  ");
            int a = inp.nextInt();
            System.out.print("Ikinci sayi: ");
            int b = inp.nextInt();

            switch (secim) {
                case 1:
                    toplam(a, b);
                    break;
                case 2:
                    cikarma(a,b);
                    break;
                case 3:
                    carpma(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    usAlma(a,b);
                    break;
                case 6:
                    modAlma(a,b);
                    break;
                case 7:
                    diktortgen(a,b);
                    break;
            }
        }
    }
}
