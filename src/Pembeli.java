/**
 * Created by dheyaanggita on 02/05/2017.
 */
public class Pembeli extends Persona {

    public Pembeli(String nama, Alamat alamat, String kontak)
    {
        super(nama, alamat, kontak);
    }

    public String getNama()
    {
        return nama;
    }

    public static void main(String[] Args)
    {
        Alamat a = new Alamat();
        a.kota = "Bandung";
        a.kec  = "Sukasari";
        a.no = "123";
        Pembeli p = new Pembeli("Jack", a, "09123123");
    }
}
