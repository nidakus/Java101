import java.util.Scanner;

public class AsalSayiRec {

    static int isPrime(int num, int i) {
        if (i==1){
            return 1;
        }else {
            if (num%i==0){
                return 0;
            }
            else return isPrime(num,i-1);
        }
    }
    public static void main(String[] args) {

        int num, prime ;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        num= scanner.nextInt();

        prime = isPrime(num,num/2);

        if (prime==1){
            System.out.println(num+" sayisi ASALDIR !");
        }else {
            System.out.println(num+" sayisi ASAL değildir !");
        }
    }
}
