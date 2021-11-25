import java.util.Scanner;

public class Algoritma2018vizeSoru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String girilen = "a";
        boolean devam = true;
        int temp = 0;
        while (devam){
            girilen = scanner.nextLine();
            int nameLength = girilen.length();
            if(nameLength <= 5){
                System.out.println(girilen);
                temp++;
            }
            else{

            }
            if(temp == 20){
                devam = false;
            }
        }
    }
}
//Klavyeden girilen stringler içinde karakter sayısı 5 ve 5'ten büyük olan stringleri ekrana yazan ve 20 adet olduğunda duran kodu yazınız
