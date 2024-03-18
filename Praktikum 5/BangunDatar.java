/* Nama File : BangunDatar.java */
/* Deskripsi : Kelas Abstrak, berisi abstraksi bangun datar */
/* Nama / NIM : Farhan Hariz Abdurrahman / 24060122140144 */

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}