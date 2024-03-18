/* Nama File : MBujurSangkar.java */
/* Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar */
/* Nama / NIM : Farhan Hariz Abdurrahman / 24060122140144 */

import java.util.Scanner;

class MBujurSangkar{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi" + sisi + "satuan adalah" + bs.hitungLuas(sisi));
    }
}
