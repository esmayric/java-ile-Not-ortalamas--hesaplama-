import java.util.Scanner;
public class NotOrtalamaHesaplama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner sc = new Scanner(System.in);

        System.out.print("matematik notunuzu giriniz: ");
        mat = sc.nextInt();

        System.out.print("fizik notunuzu giriniz: ");
        fizik = sc.nextInt();

        System.out.print("kimya notunuzu giriniz: ");
        kimya = sc.nextInt();

        System.out.print("turkce notunuzu giriniz: ");
        turkce = sc.nextInt();

        System.out.print("tarih notunuzu giriniz: ");
        tarih = sc.nextInt();

        System.out.print("muzik notunuzu giriniz: ");
        muzik = sc.nextInt();

        double ortalama;

        ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.print("ortamaniz: " +ortalama);
    }
}
