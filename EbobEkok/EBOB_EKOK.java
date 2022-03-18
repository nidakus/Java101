import java.util.Scanner;

public class EBOB_EKOK {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("\nn1 sayisini giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayisini giriniz: ");
        int n2 = input.nextInt();
        int ebob = 1;
        int ekok;
        //WHILE DONGUSU ILE;
        int i=1;
        while (i<=n1 && i<=n2){
            if(n1%i == 0 && n2%i == 0) {
                ebob = i;
            }
            i++;
        }
        /* FOR DONGUSU ILE;
        for(int i=1; i<=n1; i++){
            if(n1%i == 0 && n2%i == 0){
                ebob = i;
            }
        }
        */
        System.out.println("\nEbob: "+ ebob);

        ekok = (n1 * n2)/ebob;
        System.out.println("Ekok: " + ekok);
    }
}
