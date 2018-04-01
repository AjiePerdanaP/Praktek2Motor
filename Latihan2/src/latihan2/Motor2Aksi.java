
package latihan2;

public class Motor2Aksi {
    public static void main(String[] args) {
        Motor2 m1 = new Motor2 ();
        m1.merk="revo";
        m1.harga=1.5000;
        m1.jumlah_pesan= 4.0;
        
        m1.mengisi_bensin();
        System.out.println("total = "+m1.hargaakhir());
        m1.hargatotal();
        
        Motor2 m2 = new Motor2();
        m2.mengisi_bensin();
    
        Motor2 m3 = new Motor2("ninja",5.0000,2.0);
        m3.mengisi_bensin();
    }
}
