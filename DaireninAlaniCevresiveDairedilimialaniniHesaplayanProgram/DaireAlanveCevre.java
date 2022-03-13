import java.util.Scanner;

public class DaireAlanveCevre {

    public static void main(String[] args) {

        int r, aciOlcu;
        double pi = 3.14 , alan, cevre, daireDilimininAlani;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yaricapini Giriniz: ");
        r = inp.nextInt();
        System.out.print("Merkez Aci Olcusunu Giriniz: ");
        aciOlcu = inp.nextInt();

        alan = pi*r*r;
        cevre = 2*pi*r;
        daireDilimininAlani = (pi*r*r*aciOlcu)/360;

        System.out.println("Dairenin Alani: "+ alan);
        System.out.println("Dairenin Cevresi: "+ cevre);
        System.out.println("Acisi "+aciOlcu+" Derece Olan Daire Diliminin Alani: "+daireDilimininAlani);
    }
}
