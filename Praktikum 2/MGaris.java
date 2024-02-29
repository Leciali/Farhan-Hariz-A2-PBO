/* Program   : MGaris.java */
/* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas titik*/
/* NIM/Nama  : 24060122140144 / Farhan Hariz Abdurrahman */
/* Tanggal   : 26 Februari 2024 */

public class MGaris{
    
    public static void main(String[] args){
        Titik t1 = new Titik(3, 4);
        Titik t2 = new Titik(4, 5);
        Garis g1 = new Garis(t1, t2);

        double counterGaris = Garis.getCounterGaris();
        System.out.println("jumlah objek garis : " + counterGaris);

        System.out.println("Panjang garis g1 : " + g1.getPanjang());

        System.out.println("Gradien g1 : " + g1.getGradien());
        
        Garis g2 = g1.getRefleksiY();
        Titik awalRefleksi = g2.getTitikAwal();
        Titik akhirRefleksi = g2.getTitikAkhir();
        System.out.println("Refleksi Y : awal g2(" + awalRefleksi.getAbsis() +","+ awalRefleksi.getOrdinat()+")");
        System.out.println("Refleksi Y : akhir g2(" + akhirRefleksi.getAbsis() +","+ akhirRefleksi.getOrdinat()+")");

        System.out.println("Is tegak lurus : " + isTegakLurus(g2));
    }
}