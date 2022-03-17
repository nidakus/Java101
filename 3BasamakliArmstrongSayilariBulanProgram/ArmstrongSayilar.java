public class ArmstrongSayilar {

    public static void main(String[] args) {

        System.out.print("3 Basamakli Armstrong Sayilar: ");
        int yuzler,onlar,birler;
        int toplam;

        for(int i=100; i<1000; i++){

            yuzler=i/100;
            onlar=(i%100)/10;
            birler=i%10;

            toplam= (int) (Math.pow(yuzler,3)+Math.pow(onlar, 3)+Math.pow(birler, 3));

            if(i == toplam){

                System.out.print(i + " ");
            }

        }
    }
}
