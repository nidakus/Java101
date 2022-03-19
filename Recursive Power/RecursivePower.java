import java.util.Scanner;

public class RecursivePower {

    static int resursive(int base,int power){

        if(base == 1){
            return 1;
        }else if(power == 0){
            return 1;
        }else{
            return base * resursive(base,power-1);
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Taban sayiyi giriniz: ");
            int base = input.nextInt();
            System.out.print("Us sayisini giriniz: ");
            int power = input.nextInt();
            System.out.println("Sonuc: " + resursive(base, power));
        }
    }
}
