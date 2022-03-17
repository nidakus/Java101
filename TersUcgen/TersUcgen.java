import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        n = input.nextInt();

        for(int i=n; i>0; i--){

            for (int j = 1; j < (n - i + 2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 3); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
