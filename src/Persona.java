/**
 * Created by IwaDwiLestari on 02/05/2017.
 */
public class Persona {
    String nama;
    Alamat alamat;
    String kontak;

    public Persona(String n, Alamat a, String k){
        nama = n;
        alamat = a;
        kontak = k;
    }

    public void cetak(){
        System.out.println("Nama: "+nama);
        System.out.println("Kontak: "+kontak);
        alamat.cetak();
    }

    public static void main(String[] Args)
    {
        Alamat a = new Alamat();
        a.kota = "Purwawkarta";
        a.kec = "Sukasari";
        a.no = "2";

        Persona p = new Persona("Ronaldo S", a, "08567934299");
        p.cetak();
    }

}
