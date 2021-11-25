import java.util.Scanner;

public class Algoritma2018vizeSoru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int temp = 0;
        boolean devam = true;
        while (devam){
            sayi = scanner.nextInt();
            if (sayi > 0){
                System.out.println(sayi);
                temp++;
            }
            else{

            }
            if(temp == 5){
                devam = false;
            }

        }
    }
}
