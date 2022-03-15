import java.util.Scanner;

public class UcakBiletiHesapla {

    public static void main(String[] args) {

        int mesafe,yas,yolculukTipi;
        double tutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yasinizi giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = inp.nextInt();

        tutar = mesafe * 0.10;

        if(mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)){
            System.out.println("Hatali veri girdiniz !");
        }
        else if(yas < 12 ){

            tutar = tutar - (tutar * 0.50);

            if(yolculukTipi == 2){
                tutar = (tutar - (tutar * 0.20)) * 2;
                System.out.println("Toplam Tutar: " + tutar + " TL");
            }else if(yolculukTipi == 1){
                System.out.println("Toplam Tutar: " + tutar + " TL");
            }
        }
        else if(yas >= 12 && yas <= 24){

            tutar = tutar - (tutar * 0.10);

            if(yolculukTipi == 2){
                tutar = (tutar - (tutar * 0.20)) * 2;
                System.out.println("Toplam Tutar: " + tutar + " TL");
            }else if(yolculukTipi == 1){
                System.out.println("Toplam Tutar: " + tutar + " TL");
            }
        }
        else if(yas >= 65){

            tutar = tutar - (tutar * 0.30);

            if(yolculukTipi == 2){
                tutar = (tutar - (tutar * 0.20)) * 2;
                System.out.println("Toplam Tutar: " + tutar + " TL");
            }else if(yolculukTipi == 1){
                System.out.println("Toplam Tutar: " + tutar + " TL");
            }
        }
    }
}
