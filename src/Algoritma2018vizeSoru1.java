import java.util.Scanner;

public class Algoritma2018vizeSoru1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = 0;
        double sayi = 0;
        for(int i = 1; i <= 10; i++ ){
            System.out.print(i+". sayiyi giriniz: ");
            sayi = scanner.nextDouble();
            System.out.println();
            temp += sayi;
        }
        if (temp % sayi/2 == 0 ){
            System.out.println("Sayılar eşittir");
        }
        else{
            System.out.println("Sayilar eşit değildir");
        }
    }
}
// Klavyeden girilen 10 tane sayının eşit olup olmadığını bulan programı yapınız.
