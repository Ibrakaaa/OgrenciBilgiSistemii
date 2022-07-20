import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,valueNumber,minValue=1,maxValue=1;
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Kac Adet Sayi Girmek Istiyorsunuz?: ");
        valueNumber = input.nextInt();

        for (i =1; i<= valueNumber;i++){
            System.out.print("Lutfen "+i+". sayiyi Giriniz: ");

            number = input.nextInt();

            if ( valueNumber ==1){

                System.out.println("Sadece Bir Adet Sayi Girdiniz. En Buyuk ve En Kucuk Degerleri Bulmak " +
                        "Icin Lutfen Birden Fazla Sayi Giriniz...");


            }
            if(number>maxValue){
                maxValue = number;
            }
            if(number<minValue){
                minValue =number;
            }


        }
        System.out.println("En Buyuk Sayi: "+maxValue);
        System.out.println("En Kucuk Sayi: "+minValue);




    }
}