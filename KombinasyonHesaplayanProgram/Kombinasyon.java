import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {

        int n, r, total1= 1, total2= 1, total3= 1;
        double c;

        Scanner scn = new Scanner(System.in);
        System.out.println("Kombinasyon = C(n,r)= n! / (r! * (n-r)!)");
        System.out.print("n Sayisini Giriniz: ");
        n = scn.nextInt();
        System.out.print("r Sayisini Giriniz: ");
        r = scn.nextInt();

        for(int i =1; i<=n; i++){
            total1 = total1 * i;
        }
        System.out.println("n = "+ n + "! = " + total1);

        for(int i =1; i<=r; i++){
            total2 = total2 * i;
        }
        System.out.println("r = " + r + "! = " + total2);

        for(int i =1; i<=(n-r); i++){
            total3 = total3 * i;
        }
        System.out.println("n-r = "+ (n-r) + "! = " + total3);

        c = total1 / (total2 * total3);
        System.out.println("C(" + n + "," + r + ") = " + c);
    }
}
