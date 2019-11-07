
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan hasil per
 *                     hitungan Energi Kinetik dan Usaha.
 *  
 */

package pbo1.pkg10118033.latihan50;

public class PBO110118033Latihan50 {
    public static void main(String[] args) {
        BolaBaseball bola = new BolaBaseball();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.printf("Dik : Massa     = %1.1f g\n",bola.getMassa());
        System.out.printf("      Kecepatan = %1.1f m/s\n",bola.getKecepatan());
        System.out.printf("a.) Energi Kinetik = %1.1f J\n",bola.hitungEnergi());
        System.out.printf("b.) Usaha = %1.1f J\n",bola.hitungUsahaDiam());
    }
}