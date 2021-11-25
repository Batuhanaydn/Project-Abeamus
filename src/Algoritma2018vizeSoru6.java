public class Algoritma2018vizeSoru6 {
    public static void main(String[] args) {
        int result = 0;
        for(int m = 1; m <=3; m++){
            for(int n = 2; n <= 4; n++ ){
                result += m + n + 3;
            }
        }
        System.out.println(result);

    }
}
