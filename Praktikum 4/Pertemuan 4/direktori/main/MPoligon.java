// Nama      : Farhan Hariz Abdurrahman
// NIM       : 24060122140144
// Tanggal   : 18 Maret 2024

package org.main;

import org.bangundatar.*;

public class MPoligon extends Poligon{
    private int panjang, lebar;

    public MPoligon(int panjang, int lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}