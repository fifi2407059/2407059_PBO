package latihan_pbo.tugas2;

public class BangunRuang extends BangunDatar {
    private double tinggi;
    
    public BangunRuang(double panjang, double lebar, double tinggi) {
        // MEMANGGIL constructor induk 
        super(panjang, lebar); 
        this.tinggi = tinggi;
    }
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
    public double hitungVolume(double tinggi) {
        return hitungLuas() * tinggi; 
    }
    public double hitungVolume2() {
        return hitungLuas() * tinggi* 2; 
    }
    public void tampilkanInfoRuang() {
       super.tampilkanHasil();
       System.out.println("Tinggi: " + tinggi);
    }
}