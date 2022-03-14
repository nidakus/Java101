import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName,password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adiniz: ");
        userName = input.nextLine();
        System.out.print("Sifreniz: ");
        password = input.nextLine();

        if(userName.equals("nida") && password.equals("java123")){
            System.out.println("Giris Basarili !");
        }
        else {
            System.out.println("Bilgileriniz Yanlis ! Sifrenizi sifirlamak ister misiniz?   1.Evet    2.Hayir");
            select = input.nextInt();
            switch (select){
                case 1:
                    System.out.print("Lutfen Yeni Sifrenizi Giriniz: ");
                    newPassword = input.nextLine();

                    if(newPassword.equals("123java")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Yanlis Secim Yaptiniz. Tekrar Deneyin.");
            }
        }
    }
}

