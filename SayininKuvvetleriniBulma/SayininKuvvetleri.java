import java.util.Scanner;

public class SayininKuvvetleri {
    
    public static void main(String[] args) {

        int k;

        Scanner scn = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        k = scn.nextInt();

        System.out.println("4`un kuvvetleri: ");

        for(int i=1; i<=k; i*=4){
            System.out.println(i);
        }
        System.out.println("----------------");

        System.out.println("5`in kuvvetleri: ");

        for (int j=1; j<k; j*=5){

            System.out.println(j);
        }

    }
}
