public class Algoritma2018vizeSoru4 {
    public static void main(String[] args) {
        String girilen = "dsajldjksalkjdali";
        for (int i = 0; i<girilen.length(); i++){
            if (girilen.charAt(i) == 'a' && girilen.charAt(i+1) == 'l' && girilen.charAt(i+2) == 'i') {
                System.out.println("İçeride ali var");
            }
            else{
                System.out.println("İçeride ali yok");
            }
        }
    }
}
//Klavyeden girilen string içinde ali varsa yaz
