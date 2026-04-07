public class BangunRuang extends BangunDatar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        // MEMANGGIL constructor induk 
        super(panjang, lebar); 
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        
        return hitungLuas() * tinggi; 
    }
}