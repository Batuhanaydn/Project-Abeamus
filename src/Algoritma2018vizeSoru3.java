import java.util.Arrays;
import java.util.Scanner;

public class Algoritma2018vizeSoru3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myNum = new int[3];
        int a = 0;
        for(int i = 0; i < 3; i++){
            myNum[i] = scanner.nextInt();

        }
        Arrays.sort(myNum);
        for (int b = 0; b < myNum.length; b++) {
            System.out.print(myNum[b] + " ");
        }
    }
}
