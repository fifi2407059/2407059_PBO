public class BangunDatar {
    private double panjang; // private = Enkapsulasi
    private double lebar;

    // Constructor untuk inisialisasi
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method hitungLuas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Getter agar class anak bisa mengambil nilai (karena private)
    public double getPanjang() { return panjang; }
    public double getLebar() { return lebar; }
}