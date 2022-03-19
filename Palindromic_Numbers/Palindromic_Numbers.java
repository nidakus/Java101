import java.util.Scanner;

public class Palindromic_Numbers {

    static boolean isPalindromic(int number){

        int temp = number;
        int lastNumber,reverse =0;

        while (temp !=0){

            lastNumber = temp % 10;
            reverse = (reverse * 10) + lastNumber;
            temp /= 10;
        }
           if( number == reverse){
               System.out.println(number + " is a polindromic number.");
               return  true;
           }else{
               System.out.println(number + " is a not polindromic number.");
               return false;
           }
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = inp.nextInt();
        System.out.println(isPalindromic(number));
    }
}
