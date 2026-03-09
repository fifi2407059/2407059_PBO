package latihan_pbo.latihan4;

public class BelahKetupat extends BangunDatar {
    
double diagonal1;
    double diagonal2;
    double sisi;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        super("Belah Ketupat");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}
