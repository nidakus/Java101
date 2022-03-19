import java.util.Scanner;

public class Fibanacci_Series {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of the Fibonacci series: ");
        int number = inp.nextInt();
        int n1 = 0, n2 = 1;

        for(int i=1; i<=number; i++){

            int  sum = n1 + n2;
            System.out.print(n1 + " + " + n2 + " = "+ sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
