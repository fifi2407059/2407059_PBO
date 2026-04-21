package latihan_pbo.tugas3;
public class Main {
    public static void main(String[] args) {

        BangunDatar bd1 = new BangunDatar(3, 4);
        BangunDatar bd2 = new Persegi (5);
        BangunDatar bd3 = new Segitiga (5, 2);

        bd1.tampilkan();
        bd2.tampilkan();
        bd3.tampilkan();
    
    // BangunDatar[] data = {
    //     new BangunDatar(VarA: 3, VarB: 4),
    //     new Persegi(VarA: 5),
    //     new Segitiga(VarA: 5, VarB: 2)
    // };
    // for (BangunDatar bd : data) {
    //     bd.tampilkan();
    }
}