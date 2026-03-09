package latihan_pbo.latihan2;

class Persegi {
    private int sisi;

    // Setter untuk memberi nilai sisi
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    // Getter untuk mengambil nilai sisi
    public int getSisi() {
        return sisi;
    }

    public int hitungLuas() {
        return sisi * sisi;
    }

    public int hitungKeliling() {
        return 4 * sisi; // Koreksi: keliling persegi itu 4 x sisi
    }
}

class Lingkaran {
    private int jariJari;

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    public int getJariJari() {
        return jariJari;
    }

    public double luasLingkaran() {
        return Math.PI * jariJari * jariJari;
    }
}

class Segitiga {
    private int alas;
    private int tinggi;

    // Tambahkan setter supaya bisa diisi nilainya di Main
    public void setAlasTinggi(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luasSegitiga() {
        return 0.5 * alas * tinggi;
    }
}

public class Main {
    public static void main(String[] args) {
        // --- Persegi ---
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(5);
        System.out.println("==== Persegi =====");
        System.out.println("Sisi Persegi: " + persegi1.getSisi());
        System.out.println("Luas Persegi: " + persegi1.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi1.hitungKeliling());

        // --- Lingkaran ---
        Lingkaran lingkaran1 = new Lingkaran();
        lingkaran1.setJariJari(7);
        System.out.println("\n==== Lingkaran =====");
        System.out.println("Jari-jari: " + lingkaran1.getJariJari());
        System.out.printf("Luas Lingkaran: %.2f\n", lingkaran1.luasLingkaran()); // Pakai printf biar rapi desimalnya

        // --- Segitiga ---
        Segitiga segitiga1 = new Segitiga();
        segitiga1.setAlasTinggi(10, 5); // Set nilai dulu!
        System.out.println("\n==== Segitiga =====");
        System.out.println("Luas Segitiga: " + segitiga1.luasSegitiga());
    }
}