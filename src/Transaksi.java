import java.util.HashMap;

/**
 * Created by ronaldosimanjuntak on 02/05/2017.
 */
public class Transaksi {
    public Pembeli pembeli;
    public Petugas petugas;
    public String idTrx;
    HashMap<Integer,Penjualan> daftarBarang = new HashMap<Integer, Penjualan>();

    public void beli(Penjualan p)
    {
        p.beli(p.qty);
        //int n = p.qty;
        //p.barang.stok -= n;
        daftarBarang.put(p.barang.id, p);
    }

    public void cetak(){
        System.out.println("==========================");
        System.out.println("Petugas: " + petugas.getNama());
        System.out.println("==========================");
        System.out.println("Pembeli: " + pembeli.getNama());
        System.out.println("==========================");

        for (Penjualan p : daftarBarang.values()){
            p.cetak();
            System.out.println(" "+ p.hitungSubTotal());
        }
        System.out.println("Total: " + hitungTotal());
    }

    public double hitungTotal(){
        double total = 0;
        for (Penjualan p : daftarBarang.values()){
            total += p.hitungSubTotal();
        }
        return total;
    }

    public static void main(String[] Args){

    }
}
