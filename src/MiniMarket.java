import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ronaldosimanjuntak on 02/05/2017.
 */
public class MiniMarket {
    double pemasukan;
    public HashMap<Integer, Produk> barangJual = new HashMap<>();
    ArrayList<Transaksi> daftarTrx = new ArrayList<>();

    public void simpanTrx(Transaksi t)
    {
        daftarTrx.add(t);
    }

    public void cetak(){
        for (Transaksi t : daftarTrx){
           t.cetak();
        }
    }

    public void cetakBarangJual()
    {
        for (Produk p : barangJual.values())
        {
            p.cetak();
            System.out.println(" Stok: "+ p.stok);
        }
    }

    public double hitungPemasukan(){
        double pemasukan = 0;
        for (Transaksi t : daftarTrx){
            pemasukan += t.hitungTotal();
        }
        return pemasukan;
    }

    public Produk cariBarang(int id)
    {
        Produk p = new Produk();
        p =  barangJual.get(id);
        return p;
    }

    public void menujual(){
        // daftar barang satuan

        Satuan S = new Satuan();
        S.id = 123;
        S.nama = "Tango";
        S.harga = 1000;
        S.stok = 30;

        Satuan S1 = new Satuan();
        S1.id = 124;
        S1.nama = "Richese";
        S1.harga = 500;
        S1.stok = 30;

        Satuan S2 = new Satuan();
        S2.id = 125;
        S2.nama = "Oreo";
        S2.harga = 1500;
        S2.stok = 30;

        // daftar barang paket

        Paket P = new Paket();
        P.id = 1;
        P.nama = "Paket Murah";
        P.add(S);
        P.add(S1);
        P.stok = 20;

        Paket P1 = new Paket();
        P1.id = 2;
        P1.nama = "Paket Komplit";
        P1.add(S2);
        P1.add(S1);
        P1.stok = 25;


        // daftar penjualan barang
        barangJual.put(S.id, S);
        barangJual.put(S1.id, S1);
        barangJual.put(S2.id, S2);
        barangJual.put(P.id, P);
        barangJual.put(P1.id, P1);

    }

    public void isiUlang(int id, int n)
    {
        Produk p = new Produk();
        p = cariBarang(id);
        p.stok += n;
        barangJual.put(p.id, p);
    }

    public static void main(String[] Args){
        // daftar petugas
        Alamat A = new Alamat();
        A.kota = "Bogor";
        A.kec = "Sukasari";
        A.no = "14A";
        Petugas PG = new Petugas("Aldo", A,"08122187194", "A", 6 );

        // daftar barang yang ada di gudang
        Gudang g = new Gudang();
        //g.cetak();

        // pembeli
        Alamat a = new Alamat();
        a.no = "44";
        a.kec = "Kec 1";
        a.kota = "Kota 1";
        Pembeli pm = new Pembeli("Bambang", a, "091231231");

        // pembeli 2
        Alamat a2 = new Alamat();
        a2.no = "44";
        a2.kec = "Kec 1";
        a2.kota = "Kota 1";
        Pembeli pm2 = new Pembeli("Nobita", a, "091212231");

        // transaksi
        Transaksi tr = new Transaksi();
        tr.pembeli = pm;
        tr.petugas = PG;
        tr.idTrx = "123";

        // transaksi
        Transaksi tr2 = new Transaksi();
        tr2.pembeli = pm2;
        tr2.petugas = PG;
        tr2.idTrx = "121";

        // minimarket
        MiniMarket mr = new MiniMarket();
        mr.menujual();
        //mencari barang yang akan dibeli pembeli 1
        Produk p = new Produk();
        p = mr.cariBarang(124);
        Produk p3 = new Produk();
        p3 = mr.cariBarang(1);

        //mencari barang yang akan dibeli pembeli 2
        Produk p2 = new Produk();
        p2 = mr.cariBarang(123);

        // memasukan barang dan qty yang akan dibeli 1
        ProdukJual penj;
        penj = new ProdukJual();
        penj.barang = p;
        penj.qty = 10;
        //memasukan kedalam transaksi
        tr.beli(penj);

        ProdukJual penj3 = new ProdukJual();
        penj3.barang = p3;
        penj3.qty = 3;
        tr.beli(penj3);

        // memasukan barang dan qty yang akan dibeli 2
        ProdukJual penj2 = new ProdukJual();
        penj2.barang = p2;
        penj2.qty = 3;
        tr2.beli(penj2);

        //memasukan kedalam transaksi
        mr.simpanTrx(tr);
        mr.simpanTrx(tr2);

        //mecetak semua transaksi
        mr.cetak();

        //cetak barang yang dijual
        mr.cetakBarangJual();

        //cetak barang yang ada di gudang
        g.cetak();

        //isi barang dari gudang
        System.out.println("==== isi barang ===");
        Produk Pisi = new Produk();
        Pisi = g.cariPorduk(123);
        Pisi.cetak();
        System.out.println(" 10");
        System.out.println();
        g.muatBarang(10, Pisi);
        mr.isiUlang(123, 10);
        System.out.println("===================");

        //mencetak daftar barang yang dijual
        System.out.println("======= Barang yang dijual =======");
        mr.cetakBarangJual();

        //cetak barang yang ada di gudang
        g.cetak();
    }

}
