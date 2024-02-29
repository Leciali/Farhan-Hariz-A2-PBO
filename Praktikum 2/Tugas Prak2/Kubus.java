/* Program   : Kubus.java */
/* NIM/Nama  : 24060122140144 / Farhan Hariz Abdurrahman */
/* Tanggal   : 29 Februari 2024 */
class Kubus {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }
}