/**
 * Created by muhamadbilal on 5/2/2017.
 */
public abstract class Penjualan {
    Produk barang;
    int qty;

    public abstract void beli(int n);
    public abstract void cetak();
    public abstract double hitungSubTotal();
}
