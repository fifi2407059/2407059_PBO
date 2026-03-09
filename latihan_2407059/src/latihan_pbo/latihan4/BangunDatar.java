package latihan_pbo.latihan4;

public class BangunDatar {

    String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public double hitungLuas() {
        return 0;
    }

    public double hitungKeliling() {
        return 0;
    }

    public void tampil() {
        System.out.println("Bangun Datar : " + nama);
        System.out.println("Luas : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
        System.out.println();
    }
}