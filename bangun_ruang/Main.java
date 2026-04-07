public class Main {
    public static void main(String[] args) {
        // Membuat objek dari class anak
        BangunRuang balok = new BangunRuang(10, 5, 4);

        // Menampilkan output 
        System.out.println("Luas alas: " + balok.hitungLuas());   // Diambil dari parent
        System.out.println("Volume   : " + balok.hitungVolume()); // Diambil dari child
    }
}