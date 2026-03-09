package latihan_pbo.latihan3;

// Class BangunRuang tidak boleh public jika ditaruh di sini
class BangunRuang {
    // Encapsulasi
    private double sisi;
    private double panjang;
    protected double tinggi;
    public int alas;

    // Setter & Getter untuk sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    // Setter & Getter untuk panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }
}

// Class Main tetap public dan nama file harus Main.java
public class Main {
    public static void main(String[] args) {

        BangunRuang bangunRuang = new BangunRuang();

        System.out.println("===SISI1 BANGUN RUANG===");
        bangunRuang.setSisi(25);
        System.out.println(bangunRuang.getSisi());
        
        System.out.println("===SISI2 BANGUN RUANG===");
        bangunRuang.alas = 27; // Bisa diakses langsung karena modifier public
        System.out.println(bangunRuang.alas);

        System.out.println("===PANJANG BANGUN RUANG===");
        bangunRuang.setPanjang(5);
        System.out.println(bangunRuang.getPanjang());
    }
}