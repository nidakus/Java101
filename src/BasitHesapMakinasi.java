import java.util.Scanner;

public class BasitHesapMakinasi {

    public static void main(String[] args) {

        int n1,n2,select;

        Scanner inp = new Scanner(System.in);
        System.out.print("1.Sayiyi Giriniz: ");
        n1 = inp.nextInt();
        System.out.print("2.Sayiyi Giriniz: ");
        n2 = inp.nextInt();

        System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz:");
        System.out.println("1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme");
        System.out.print("Seciminiz: ");
        select = inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Cikarma: "+(n1-n2));
                break;
            case 3:
                System.out.println("Carpma: "+(n1*n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println("Bolme: "+ (n1/n2));
                }
                    else{
                        System.out.println("Sayi 0`a bolunemez.Lutfen tekrar sayi giriniz..");
                    }
                break;
            default:
                System.out.println("Yanlis Secim Yaptiniz.Tekrar Deneyiniz..");
        }
    }
}
