import java.util.Scanner;

public class Perfect_Number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        for(int i=1; i<number; i++){

            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){

            System.out.println(number + " is a perfect number.");

        }else{

            System.out.println(number + " isn`t a perfect number.");
        }
    }
}
