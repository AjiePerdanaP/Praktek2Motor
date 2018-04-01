package latihan2;

public class Motor2 {
    String merk;
    Double harga;
    Double jumlah_pesan;

    public Motor2() {
        merk="klx";
        harga=3.0000;
        jumlah_pesan=5.0;
    }
    
    
    void mengisi_bensin(){
        System.out.println("merk :"+merk);
        System.out.println("harga :"+harga);
        System.out.println("jumlah pesan :"+jumlah_pesan);
    }
        Double hargaakhir(){
            Double total;
            total = harga*jumlah_pesan;
            return total;
    }
        void hargatotal(){
            System.out.println("totalnya adalah="+hargaakhir());
        }
}
