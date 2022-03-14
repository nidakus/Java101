import java.util.Scanner;

public class Burclar {

    public static void main(String[] args) {

        int month, day;

        Scanner inp = new Scanner(System.in);
        System.out.print("Girmek istediginiz ayi sayisal olarak yaziniz: ");
        month = inp.nextInt();
        System.out.print("Girmek istediginiz gunu yaziniz: ");
        day = inp.nextInt();

        if(month == 1 && (day <= 31 && day >=1) ){
            if(day <= 21){
                System.out.println("Oglak Burcusunuz");
            }else if(day > 21){
                System.out.println("Kova Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
        if(month == 2 && (day <= 28 && day >=1) ){
            if(day <= 19){
                System.out.println("Kova Burcusunuz");
            }else if(day > 19){
                System.out.println("Balik Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
        if(month == 3 && (day <= 31 && day >=1) ){
            if(day <= 20){
                System.out.println("Balik Burcusunuz");
            }else if(day > 20){
                System.out.println("Koc Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
        if(month == 4 && (day <= 30 && day >=1) ){
            if(day <= 20){
                System.out.println("Koc Burcusunuz");
            }else if(day > 20){
                System.out.println("Boga Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
        if(month == 5 && (day <= 31 && day >=1) ){
            if(day <= 21){
                System.out.println("Boga Burcusunuz");
            }else if(day > 21){
                System.out.println("Ikizler Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
        if(month == 6 && (day <= 30 && day >=1) ){
            if(day <= 22){
                System.out.println("Ikizler Burcusunuz");
            }else if(day > 22){
                System.out.println("Yengec Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
        if(month == 7 && (day <= 31 && day >=1) ){
            if(day <= 22){
                System.out.println("Yengec Burcusunuz");
            }else if(day > 22){
                System.out.println("Aslan Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
        if(month == 8 && (day <= 31 && day >=1) ){
            if(day <= 22){
                System.out.println("Aslan Burcusunuz");
            }else if(day > 22){
                System.out.println("Basak Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
        if(month == 9 && (day <= 30 && day >=1) ){
            if(day <= 22){
                System.out.println("Basak Burcusunuz");
            }else if(day > 22){
                System.out.println("Terazi Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }if(month == 10 && (day <= 31 && day >=1) ){
            if(day <= 22){
                System.out.println("Terazi Burcusunuz");
            }else if(day > 22){
                System.out.println("Akrep Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
        if(month == 11 && (day <= 30 && day >=1) ){
            if(day <= 21){
                System.out.println("Akrep Burcusunuz");
            }else if(day > 21){
                System.out.println("Yay Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }if(month == 12 && (day <= 31 && day >=1) ){
            if(day <= 21){
                System.out.println("Yay Burcusunuz");
            }else if(day > 21){
                System.out.println("Oglak Burcusunuz");
            }else {
                System.out.println("Gecersiz bir tarih girdiniz !");
            }
        }
    }
}
