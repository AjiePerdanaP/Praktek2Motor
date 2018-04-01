
package latihan2;

public class Motor2Aksi {
    public static void main(String[] args) {
        Motor2 m1 = new Motor2 ();
        m1.merk="revo";
        m1.harga=1.5000;
        m1.jumlah_pesan= 4.0;
        
        m1.mengisi_bensin();
        System.out.println("total = "+m1.hargaakhir());
    }
}
