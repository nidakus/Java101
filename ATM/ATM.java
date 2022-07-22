import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String ad,sifre;
        int hak = 3;
        int bakiye = 1500;
        int secim;

        while (hak > 0){

            System.out.print("Kullanici Adiniz: ");
            ad = inp.nextLine();
            System.out.print("Sifreniz: ");
            sifre = inp.nextLine();

            if(ad.equals("nida") && sifre.equals("01patika")){
                System.out.println("Sisteme giris yaptiniz.");
                do {
                    System.out.println(" 1- Para Yatirma\n 2- Para Cekme\n 3- Bakiye Sorgula\n 4- Cikis Yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    secim = inp.nextInt();

                    switch (secim){
                        case 1:
                            System.out.print("Yatirmak istediginiz tutari giriniz: " );
                            int tutar = inp.nextInt();
                            bakiye += tutar;
                            break;
                        case 2:
                            System.out.print("Cekmek istediginiz tutari giriniz: ");
                            tutar = inp.nextInt();
                            if(tutar>bakiye){
                                System.out.println("Bakiye Yetersiz !");
                            }else{
                                bakiye -= tutar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                    }
                }while (secim != 4);
                System.out.println("Iyi Gunler.");
                break;
            }else{
                hak--;
                System.out.println("Bilgileriniz yanlis. Tekrar deneyiniz." );
                if(hak == 0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan hakkiniz: " + hak);
                }
            }
        }
    }
} 
