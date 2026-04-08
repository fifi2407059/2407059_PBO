package latihan_pbo.tugas2;

public class BangunDatar {
    protected double panjang; // private = Enkapsulasi
    protected double lebar;

    // Constructor untuk inisialisasi
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    // Method hitungLuas
    public double hitungLuas() {
        return panjang * lebar * 2;
    }
    
    public void tampilkanHasil() {
        System.out.println("panjang: " + panjang);
        System.out.println("lebar = " + lebar);
    }
}