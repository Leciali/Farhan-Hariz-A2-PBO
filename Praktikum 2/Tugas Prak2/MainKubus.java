/* Program   : Kubus.java */
/* NIM/Nama  : 24060122140144 / Farhan Hariz Abdurrahman */
/* Tanggal   : 29 Februari 2024 */

public class MainKubus {
    public static void main(String[] args) {
        Kubus kubus1 = new Kubus(5);
        System.out.println("Volume Kubus : " + kubus1.hitungVolume());
        System.out.println("Luas Permukaan Kubus : " + kubus1.hitungLuasPermukaan());
    }
}