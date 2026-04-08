package latihan_pbo.tugas2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class anak
        BangunRuang balok = new BangunRuang(10, 5, 4);

        balok.tampilkanInfoRuang();
        // Menampilkan output 
        System.out.println("Luas alas = " + balok.hitungLuas());   // Diambil dari parent
        System.out.println("Volume dari class parent : " + balok.hitungVolume());
        System.out.println("Volume dari class child : " + balok.hitungVolume2());
        // Diambil dari child
    }
}