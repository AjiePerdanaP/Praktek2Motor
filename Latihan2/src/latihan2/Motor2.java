package latihan2;

public class Motor2 {
    String merk;
    Double harga;
    Double jumlah_pesan;
    
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
}
