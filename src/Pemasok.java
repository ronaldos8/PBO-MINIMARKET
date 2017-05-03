import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Citra on 5/2/2017.
 */
public class Pemasok {

    HashMap<Integer, Produk> daftarPenjualan = new HashMap<Integer, Produk>();

    int id;
    String nama;

    public Produk cariBarang(int id)
    {
       return daftarPenjualan.get(id);
    }

    public void isiProduk()
    {
        Satuan s = new Satuan();
        s.id = 1;
        s.nama = "Produk 1";
        s.harga = 3000;

        daftarPenjualan.put(s.id, s);
    }

    public static void main(String[] Args)
    {

    }

}
