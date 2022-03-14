import java.util.Scanner;

public class Sicaklik {

    public static void main(String[] args) {

        int sicaklik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sicaklik Kac Derece? : ");
        sicaklik = inp.nextInt();

        if(sicaklik < 5){
            System.out.println("Kayak Yapabilirsiniz.");
        }
        else if(sicaklik >= 5 && sicaklik <=15){
            System.out.println("Sinemaya Gidebilirsiniz.");
            if(sicaklik >=10 && sicaklik <=15){
                System.out.println("Piknik Yapabilirsiniz.");
            }
        }
        else if(sicaklik > 15 && sicaklik <= 25){
            System.out.println("Piknik Yapabilirsiniz.");
        }
        else{
            System.out.println("Yuzebilirsiniz.");
        }
    }

}

