import java.util.Scanner;

public class MinMaxSayi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz? : ");
        int sayi = input.nextInt();
        int max = 0,min = 0;

        for(int i=1; i<=sayi; i++){
            System.out.print(i + ". Sayiyi giriniz: ");
            int _sayi = input.nextInt();
            if (_sayi > max) {
                if (min == 0) {
                    min = _sayi;
                }
                max = _sayi;
            }
            if (_sayi < min) {
                if (max == 0) {
                    max = _sayi;
                }
                min = _sayi;
            }
        }
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);
    }
}
