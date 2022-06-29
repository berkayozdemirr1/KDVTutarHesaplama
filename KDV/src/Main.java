import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOrani = 0,
                kdvTutar, toplamTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucret tutarini Giriniz : ");
        tutar = input.nextDouble();

        if (tutar <= 0) {
            System.out.println("Aradiginiz Kriterlere Uygun Sonuc Bulunamadi :)");
            return;
        }
        kdvOrani = tutar > 1000 ? 0.08 : 0.18;

        kdvTutar = kdvOrani * tutar;

        toplamTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Orani : " + kdvOrani);
        System.out.println("KDV Tutari : " + kdvTutar);
        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}