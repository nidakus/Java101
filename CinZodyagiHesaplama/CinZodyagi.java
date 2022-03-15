import java.util.Scanner;

public class CinZodyagi {

    public static void main(String[] args) {

        int yil, kalan;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        yil = inp.nextInt();

        kalan = yil % 12;

        switch (kalan){
            case 0:
                System.out.print("Çin Zodyağı Burcunuz : Maymun ");
                break;

            case 1:
                System.out.print("Çin Zodyağı Burcunuz : Horoz ");
                break;

            case 2:
                System.out.print("Çin Zodyağı Burcunuz : Kopek ");
                break;

            case 3:
                System.out.print("Çin Zodyağı Burcunuz : Domuz ");
                break;

            case 4:
                System.out.print("Çin Zodyağı Burcunuz : Fare ");
                break;

            case 5:
                System.out.print("Çin Zodyağı Burcunuz : Okuz ");
                break;

            case 6:
                System.out.print("Çin Zodyağı Burcunuz : Kaplan ");
                break;

            case 7:
                System.out.print("Çin Zodyağı Burcunuz : Tavsan ");
                break;

            case 8:
                System.out.print("Çin Zodyağı Burcunuz : Ejderha ");
                break;

            case 9:
                System.out.print("Çin Zodyağı Burcunuz : Yilan ");
                break;

            case 10:
                System.out.print("Çin Zodyağı Burcunuz : At ");
                break;

            case 11:
                System.out.print("Çin Zodyağı Burcunuz : Koyun ");
                break;
        }
    }
}
