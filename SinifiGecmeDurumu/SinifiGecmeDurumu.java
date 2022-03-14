import java.util.Scanner;

public class SinifiGecmeDurumu {

    public static void main(String[] args) {

        int matematik, fizik, turkce, kimya, muzik, sayac=0, toplam=0;
        double ort ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        matematik = inp.nextInt();
        if(matematik >= 0 && matematik <=100){
            toplam += matematik;
            sayac ++;
        }
        System.out.print("Fizik Notu: ");
        fizik= inp.nextInt();
        if(fizik >= 0 && fizik <=100){
           toplam += fizik;
           sayac ++;
        }
        System.out.print("Turkce Notu: ");
        turkce = inp.nextInt();
        if(turkce >= 0 && turkce <=100){
            toplam += turkce;
            sayac ++;
        }
        System.out.print("Kimya Notu: ");
        kimya= inp.nextInt();
        if(kimya >= 0 && kimya <=100){
            toplam += kimya;
            sayac++;
        }
        System.out.print("Muzik Notu: ");
        muzik = inp.nextInt();
        if(muzik >= 0 && muzik <=100){
            toplam += muzik;
            sayac++;
        }
        ort = toplam / sayac;
        if(ort < 55){
            System.out.println("Sinifta Kaldiniz..");
        }else {
            System.out.println("Tebrikler ! Sinifi Gectiniz.");
        }
        System.out.println("Ortlamaniz: "+ ort);
    }
}
