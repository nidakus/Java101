import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        int yil, kalan;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Yil Giriniz: ");
        yil = girdi.nextInt();

        if(yil % 4 == 0){
            if(yil % 100 != 0){
                System.out.println(yil + " Artik Yildir");
            }
            else if((yil % 100 == 0) && (yil % 400 == 0)){
                 System.out.println(yil + " Artik Yildir");
            }else{
                 System.out.println(yil + " Artik Yil Degildir.");
             }
        }
        else{
            System.out.println(yil + " Artik Yil Degildir.");
        }
    }
}
