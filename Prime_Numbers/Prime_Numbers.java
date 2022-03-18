public class Prime_Numbers {

    public static void main(String[] args) {
        
        int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++) //2 den 100 e kadar sayilara bakiyoruz
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++) //sıradaki sayının kendinden öncekilere bölünüp bölünmediğini kontrol ederiz
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol==0)
            {
                System.out.print(sayi+" ");
                sayac++;
            }
        }
    }
}

