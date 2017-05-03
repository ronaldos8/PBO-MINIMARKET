import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Citra on 5/2/2017.
 */
public class Gudang  {

    public HashMap<Integer, Produk> daftarPersediaan = new HashMap<>();

    public void beli(Produk p)
    {
        daftarPersediaan.put(p.id, p);
    }

    public Gudang()
    {
        // daftar barang satuan
        Satuan S = new Satuan();
        S.id = 123;
        S.nama = "Tango";
        S.harga = 1000;
        S.stok = 50;

        Satuan S1 = new Satuan();
        S1.id = 124;
        S1.nama = "Richese";
        S1.harga = 500;
        S1.stok = 50;

        Satuan S2 = new Satuan();
        S2.id = 125;
        S2.nama = "Oreo";
        S2.harga = 1500;
        S2.stok = 50;

        // daftar barang paket

        Paket P = new Paket();
        P.id = 1;
        P.nama = "Paket Murah";
        P.add(S);
        P.add(S1);
        P.stok = 30;

        Paket P1 = new Paket();
        P1.id = 2;
        P1.nama = "Paket Komplit";
        P1.add(S2);
        P1.add(S1);
        P1.stok = 20;


        // daftar penjualan barang
        daftarPersediaan.put(S.id, S);
        daftarPersediaan.put(S1.id, S1);
        daftarPersediaan.put(S2.id, S2);
        daftarPersediaan.put(P.id, P);
        daftarPersediaan.put(P1.id, P1);
    }

    public void muatBarang(int n, Produk p)
    {
        if (p.stok > n)
        {
            p.stok -= n;
        }
    }

    public Produk cariPorduk(int n)
    {
        return daftarPersediaan.get(n);
    }

    public void cetak()
    {
        System.out.println("====== Persediaan Barang ========");
        for (Produk p : daftarPersediaan.values())
        {
            p.cetak();
            System.out.println();
            System.out.println("Stok: " + p.stok);
        }
    }

}
