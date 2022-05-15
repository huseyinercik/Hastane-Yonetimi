import java.util.HashMap;
import java.util.Map;

public class Hasta extends Kisi {

    static Map<Integer, Hasta> hastaListesiMap = new HashMap<>();

    private String teshis;

    public Hasta() {
    }

    public Hasta(String tcNo, String adSoyad, String dogumYili, String teshis) {
        super(tcNo, adSoyad, dogumYili);
        this.teshis = teshis;
    }

    public String getTeshis() {
        return teshis;
    }

    public void setTeshis(String teshis) {
        this.teshis = teshis;
    }

    @Override
    public String toString() {
        return "Hasta" +
                "teshis='" + teshis + '\'' +
                "} " + super.toString();
    }
}
