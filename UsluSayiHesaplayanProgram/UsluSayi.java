import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {

        int n,k,total =1;

        Scanner scn = new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi girin: ");
        n = scn.nextInt();
        System.out.print("Us olacak sayiyi girin: ");
        k = scn.nextInt();

        for (int i=1; i<=k; i++){
            total *= n;
        }
        System.out.println("Cevap: "+ total);
    }
}
