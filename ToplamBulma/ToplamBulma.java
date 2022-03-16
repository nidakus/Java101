import java.util.Scanner;

public class ToplamBulma {
    public static void main(String[] args) {

         int k, total =0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Sayi Giriniz: ");
            k = scan.nextInt();

            if((k%2 ==0) && (k%4 == 0)){
               total += k;
            }
        }while (k%2 ==0);

        System.out.println("Cift ve 4`e bolunebilen sayilarin toplami: " + total);
    }
}
