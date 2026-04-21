package latihan_pbo.tugas3;

public class BangunDatar {
    private double varA; // Prinsip enkapsulasi 
    private double varB;

    // Constructor 1: 2 parameter [cite: 5, 6]
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 2: 1 parameter [cite: 5, 6]
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    // Getter untuk akses variabel di class anak 
    public double getVarA() { return varA; }
    public double getVarB() { return varB; }

    public double hitungLuas() {
        return 0; // Nilai default 0 [cite: 8]
    }

    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("--------------------");
    }
}