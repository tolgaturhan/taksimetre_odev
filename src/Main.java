import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km,kmPrc = 2.20,minPrc = 10,total;
        Scanner taxi = new Scanner(System.in);

        System.out.print("Lütfen Km Bilgisi Giriniz: ");
        km = taxi.nextDouble();

        total = (km * kmPrc) + minPrc;

        total = (total < 20) ? 20 : total;

        System.out.println("Taksimetre Açılış Ücreti: " + minPrc + " TL");
        System.out.println("Gidilecek Mesafe Ücreti: " + (km * kmPrc) + " TL");
        System.out.println("Ödenecek Tutar: " + total);

        
    }
}
