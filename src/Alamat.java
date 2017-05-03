/**
 * Created by IwaDwiLestari on 02/05/2017.
 */
public class Alamat {
    String kota;
    String kec;
    String no;

    public void cetak(){
        System.out.println("Kota "+kota);
        System.out.println("Kecamatan "+kec);
        System.out.println("no. "+no);
    }

    public static void main(String[] args){
        Alamat a = new Alamat();
        a.kota = "Purwakarta";
        a.kec = "Sukasari";
        a.no = "2";
        a.cetak();
    }
}
