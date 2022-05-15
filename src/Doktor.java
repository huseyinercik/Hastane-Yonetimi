import java.util.HashMap;
import java.util.Map;

public class Doktor extends Kisi {

    static Map<Integer, Doktor> doktorListesiMap = new HashMap<>();

    private String brans;
    private String sicilNo;

    public Doktor() {
    }

    public Doktor(String tcNo, String adSoyad, String dogumYili, String brans, String sicilNo) {
        super(tcNo, adSoyad, dogumYili);
        this.brans = brans;
        this.sicilNo = sicilNo;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "brans='" + brans + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                "} " + super.toString();
    }
}
