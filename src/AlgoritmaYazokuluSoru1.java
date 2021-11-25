public class AlgoritmaYazokuluSoru1 {
    public static void main(String[] args) {
        int katsayı = 0;
        int sayi = 16;
        boolean devam = true;
        while(devam){
            if (sayi % 2 == 0) {
                sayi = sayi / 2;
                katsayı++;
            }

            else{
                System.out.println("2'nin katı dğeildir.");
                devam = false;
            }
            if (sayi == 1) {
                devam = false;
            }
        }
        if (katsayı != 0){
            System.out.println(katsayı);
        }
    }
}
// girilen x sayısının 2'nin kaçıncı kuvveti olduğunu hesaplayan program