import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");
        k= input.nextInt();

        for( int i=1;i<=k; i*=4){
            System.out.println(i);

        }
        System.out.println("------------------");

        for(int i=1;i<=k; i*=5){
            System.out.println(i);

        }

    }
}












