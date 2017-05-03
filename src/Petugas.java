/**
 * Created by dheyaanggita on 02/05/2017.
 */
public class Petugas extends Persona {
    String gol;
    int lembur;

    public Petugas(String n, Alamat a, String k, String gl, int l){
        super(n, a, k);
        gol = gl;
        lembur = l;
    }

    public void cetak(){
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : ");
        alamat.cetak();
        System.out.println("Kontak : "+kontak);
        System.out.println("Gaji : "+ hitungGaji());
        System.out.println("Golongan : "+gol);
        System.out.println("Lembur(Jam) : "+lembur);
    }

    public String getNama()
    {
        return nama;
    }

    public double hitungGaji(){
        double gaji = 0;
        if (gol == "A")
        {
            gaji = 75000 + (lembur * 5000);
        }else if (gol == "B")
        {
            gaji = 60000 + (lembur * 5000);
        }else {
            gaji = 50000 + (lembur * 5000);
        }

        return gaji;
    }

    public void naikGol(){
        if (gol == "B")
        {
            gol = "A";
        }else if (gol == "C")
        {
            gol = "B";
        }
    }

    public static void main(String[] Args)
    {
        Alamat a = new Alamat();
        a.kota = "Tangerang";
        a.kec = "Neglasari";
        a.no = "4";
        Petugas p = new Petugas("Ronaldo", a, "091231", "B", 1);
        p.cetak();
    }
}
