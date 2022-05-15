import java.util.HashMap;
import java.util.Map;

public class Hemsire extends Kisi {

    static Map<Integer,Hemsire> hemsireListesiMap = new HashMap<>();

    private String brans;
    private String sicilNo;

    public Hemsire() {
    }

    public Hemsire(String tcNo, String adSoyad, String dogumYili, String brans, String sicilNo) {
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
        return "Hemsire{" +
                "brans='" + brans + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                "} " + super.toString();
    }
}
