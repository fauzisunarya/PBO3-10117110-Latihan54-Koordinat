

/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * titik dan warna koordinat Dengan Menggunakan Konsep OOP inheritance,olymorphism dan constructor
 */

package pbo3.pkg10117110.latihan54.koordinat;


public class PBO310117110Latihan54Koordinat {


    public static void main(String[] args) {
        
        WarnaKoordinat obj = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna koordinat : "+obj.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+obj.getX()+", y : "+obj.getY());

    }
    
}
