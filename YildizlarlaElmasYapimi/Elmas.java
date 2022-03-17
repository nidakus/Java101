public class Elmas {

    public static void main(String[] args) {

        int n = 5;

        for(int i=1; i<=5; i++) {

            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>1; i--){

            for (int j = 1; j < (n - i + 2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 3); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
