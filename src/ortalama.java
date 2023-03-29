import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Ortalama: " + ortalama);

        if (ortalama>=50){
            System.out.println("Geçtiniz!");
        }
        else {
            System.out.println("Geçemediniz!");
        }
    }

}
