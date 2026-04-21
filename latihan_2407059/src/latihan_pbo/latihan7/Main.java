package latihan_pbo.latihan7;

public class Main {
    public static void main(String[] args) {
        MenuItem[] Menu = new MenuItem[3];

        Menu[0] = new MenuItem("ketoprak", 12000, 3);
        Menu[1] = new MenuItem("Nasi Goreng", 15000, 4);
        Menu[2] = new MenuItem("Soda Gembira", 8000, 5);
        

        double hitungTotal = 0;

        for (MenuItem m:Menu){
            
            m.tampilkan();
            hitungTotal+=m.hitungTotal();
        }

        System.out.println("total = "+ hitungTotal);
    }
}