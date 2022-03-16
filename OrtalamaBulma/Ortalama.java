import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {

        int k, toplam = 0, sayac = 0;
        double ort;

        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        k = inp.nextInt();

        for(int i = 1; i <= k; i++){
            if((i%3 == 0) && (i%4 ==0)){
                toplam += i;
                System.out.println(i);
                sayac ++;
            }
        }
        ort = toplam / sayac;
        System.out.print("3`e ve 4`e bolunebilen sayilarin ortalamasi: " + ort);
    }
}
