import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {

        int a,b,c;
        double u,alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("a Kenarini Giriniz: ");
        a = girdi.nextInt();
        System.out.print("b Kenarini Giriniz: ");
        b = girdi.nextInt();
        System.out.print("c Kenarini Giriniz: ");
        c = girdi.nextInt();

        u = (a+b+c)/2;
        alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("Ucgenin Alani: " + alan);
    }
}
