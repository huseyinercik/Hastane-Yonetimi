public class Kisi {
    private String tCNo;
    private String adSoyad;
    private String dogumYili;


    public Kisi() {
    }

    public Kisi(String tcNo, String adSoyad, String dogumYili) {
        this.tCNo = tcNo;
        this.adSoyad = adSoyad;
        this.dogumYili = dogumYili;

    }

    public String gettCNo() {
        return tCNo;
    }

    public void settCNo(String tCNo) {
        this.tCNo = tCNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(String dogumYili) {
        this.dogumYili = dogumYili;
    }


    @Override
    public String toString() {
        return "Kisi{" +
                "tcNo='" + tCNo + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", dogumYili='" + dogumYili + '\'' +
                '}';
    }
}
