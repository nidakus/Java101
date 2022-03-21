import java.util.Scanner;

public class Recursive_Method {

    /* Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

       Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
       Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
       Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
       Yine her ekleme işleminde sayının son değerini ekrana yazdırın. */

    static int recursive(int n){

        if (n <= 0) {
            System.out.print(n + " ");
            return 0;
        }
        System.out.print(n + " ");
        recursive(n - 5);
        System.out.print(n + " ");
        return 0;
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("N sayisi: ");
        int n = inp.nextInt();
        recursive(n);
    }
}
