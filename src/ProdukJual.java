/**
 * Created by muhamadbilal on 5/2/2017.
 */
public class ProdukJual extends Penjualan{

    @Override
    public void beli(int n) {
        qty = n;
        barang.stok -= n;
    }
    @Override
    public void cetak()
    {
        barang.cetak();
        System.out.print("  " + qty);
    }

    @Override
    public double hitungSubTotal() {
        double subTotal = 0;
        subTotal = barang.hitungHarga() * qty;
        return subTotal;
    }

    public static void main(String[] Args)
    {
    }

}
