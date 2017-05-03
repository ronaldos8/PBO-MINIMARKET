/**
 * Created by IsniAinur on 5/2/2017.
 */
public class Satuan extends Produk {

    public double harga;

    @Override
    public double hitungHarga(){
        return harga;
    }

    @Override
    public void cetak()
    {
        System.out.print(id +"  ");
        System.out.print(nama +"  ");
        System.out.print(hitungHarga());
    }

    public static void main(String[] Args){
        Satuan s = new Satuan();
        s.id = 1;
        s.nama = "Teh Pucuk";
        s.harga = 4000;
        s.cetak();
    }

}
