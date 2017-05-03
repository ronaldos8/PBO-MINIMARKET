import java.util.ArrayList;

/**
 * Created by IsniAinur on 5/2/2017.
 */
public class Paket extends Produk {

    public int id;
    public String nama;
    ArrayList<Satuan> barang = new ArrayList<>();


    @Override
    public double hitungHarga(){
        double total = 0;
        for (Satuan s : barang)
        {
            total += s.harga;
        }
        total -= (total * 0.1);
        return total;
    }

    @Override
    public void cetak()
    {
        System.out.println("=====" + nama + "=====");
        for (Satuan s : barang)
        {
            s.cetak();
            System.out.println();
        }
        System.out.print("Harga Paket : " + hitungHarga());
    }

    public void add(Satuan s)
    {
        barang.add(s);
    }

    public static void main(String[] Args){
        Satuan s = new Satuan();
        s.nama = "Cabe";
        s.harga = 2000;

        Satuan s2 = new Satuan();
        s2.nama = "Bawang";
        s2.harga = 3000;

        Paket p = new Paket();
        p.add(s);
        p.add(s2);
        p.cetak();
    }

}
