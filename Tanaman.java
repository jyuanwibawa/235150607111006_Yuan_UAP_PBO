/**
 * Tanaman
 */
public abstract class Tanaman {

    private int masaJidup;
    private int lamaHidup;
    private int berbuah;
    private int buah;
    private double perkembangan;
    private double prosesBerbuah;

    public Tanaman(int masaJidup, int lamaHidup, int berbuah, int buah, double perkembangan, double prosesBerbuah) {
        this.masaJidup = masaJidup;
        this.lamaHidup = lamaHidup;
        this.berbuah = berbuah;
        this.buah = buah;
        this.perkembangan = perkembangan;
        this.prosesBerbuah = prosesBerbuah;
    }

    public abstract void berkembang();

    public String status(String mati, String hidup) {
        return status(mati, hidup);
    }

    public String toString(int masaHidup, int lamaHidup, int buah) {
            return toString(masaHidup, lamaHidup, buah);
    }


    public void setMasaJidup(int masaJidup) {
        this.masaJidup = masaJidup;
    }
    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }
    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }
    public void setBuah(int buah) {
        this.buah = buah;
    }
    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }
    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public int getMasaJidup() {
        return masaJidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public int getBuah() {
        return buah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }
    

}