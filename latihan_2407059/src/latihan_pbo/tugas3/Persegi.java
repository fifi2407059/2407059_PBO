package latihan_pbo.tugas3;

public class Persegi extends BangunDatar {
    public Persegi(double sisi) {
        super(sisi); // Memanggil constructor 1 parameter di induk 
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarA(); // Sisi * Sisi [cite: 15, 20]
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + getVarA()); // Sesuaikan nama variabel [cite: 19, 21]
        System.out.println("Luas: " + hitungLuas());
        System.out.println("--------------------");
    }
}