package latihan_pbo.latihan4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan sisi persegi: ");
            double sisi = input.nextDouble();
            Persegi p = new Persegi(sisi);

            System.out.print("Masukkan panjang persegi panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar persegi panjang: ");
            double lebar = input.nextDouble();
            PersegiPanjang pp = new PersegiPanjang(panjang, lebar);

            System.out.print("Masukkan alas segitiga: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggi = input.nextDouble();
            System.out.print("Masukkan sisi A: ");
            double a = input.nextDouble();
            System.out.print("Masukkan sisi B: ");
            double b = input.nextDouble();
            System.out.print("Masukkan sisi C: ");
            double c = input.nextDouble();
            Segitiga s = new Segitiga(alas, tinggi, a, b, c);

            System.out.print("Masukkan diagonal 1 belah ketupat: ");
            double d1 = input.nextDouble();
            System.out.print("Masukkan diagonal 2 belah ketupat: ");
            double d2 = input.nextDouble();
            System.out.print("Masukkan sisi belah ketupat: ");
            double sk = input.nextDouble();
            BelahKetupat bk = new BelahKetupat(d1, d2, sk);

            System.out.println("\nHASIL PERHITUNGAN\n");

            p.tampil();
            pp.tampil();
            s.tampil();
            bk.tampil();
        }
    }
}