import  java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;
        double tutar;
        int armutKg, elmaKg, domatesKg,muzKg,patlicanKg;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kac Kilo? : ");
        armutKg = inp.nextInt();
        System.out.print("Elma Kac Kilo? : ");
        elmaKg = inp.nextInt();
        System.out.print("Domates Kac Kilo? : ");
        domatesKg = inp.nextInt();
        System.out.print("Muz Kac Kilo? : ");
        muzKg = inp.nextInt();
        System.out.print("Patlican Kac Kilo? : ");
        patlicanKg = inp.nextInt();

        armut *= armutKg;
        elma *= elmaKg;
        domates *= domatesKg;
        muz *= muzKg;
        patlican *= patlicanKg;
        tutar = armut+elma+domates+muz+patlican;
        System.out.println("Toplam TUtar: "+tutar+" TL");
    }
}
