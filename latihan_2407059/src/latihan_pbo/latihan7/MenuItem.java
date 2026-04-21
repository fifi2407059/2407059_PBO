package latihan_pbo.latihan7;

public class MenuItem extends Menu {

    private int jumlah;

    // Constructor
    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    // Hitung total
    @Override
    public double  hitungTotal() {
        return harga * jumlah;
    }

    // Tampilkan
    @Override
    public void tampilkan() {
        System.out.println(nama + " = " + harga + "*" + jumlah + " = " + hitungTotal());
    }
}