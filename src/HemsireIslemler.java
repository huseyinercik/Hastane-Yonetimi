import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HemsireIslemler implements IslemlerInterface {
    static Scanner scan = new Scanner(System.in);
    static int tercih1;
    static int hemsireKimID = 3000;

    public static void hemsireIsl() {
        HemsireIslemler obj = new HemsireIslemler();
        System.out.println("============= HEMŞİRE İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t 6-ÇIKIŞ\n");

        System.out.println("Lütfen seçiminizi yapınız");

        try {
            tercih1 = scan.nextInt();

            switch (tercih1) {

                case 1:
                    obj.ekleme();
                    hemsireIsl();
                    break;
                case 2:
                    obj.arama();
                    hemsireIsl();
                    break;
                case 3:
                    obj.listeleme();
                    hemsireIsl();
                    break;
                case 4:
                    obj.silme();
                    hemsireIsl();
                    break;
                case 5:
                    obj.anaMenu();
                    break;
                case 6:
                    obj.cikis();
                    break;
                default:
                    System.out.println("Hatalı giriş lütfen seçimlerden birini giriniz");

            }

        } catch (Exception e) {
            System.out.println("Lütfen sayı giriniz");
            scan.nextLine();
            hemsireIsl();
        }
    }


    @Override
    public void ekleme() {
        System.out.println("Tc no giriniz");
        scan.nextLine();
        String tCNo = scan.nextLine();
        System.out.println("Ad soyad giriniz");
        String adSoyad = scan.nextLine();
        System.out.println("Doğum yılı giriniz");
        String dogumYili = scan.next();
        scan.nextLine();
        System.out.println("Branş giriniz");
        String brans = scan.nextLine();
        System.out.println("Sicil no giriniz");
        String sicilNo = scan.nextLine();
        Hemsire obj = new Hemsire(tCNo, adSoyad, dogumYili, brans, sicilNo);
        Hemsire.hemsireListesiMap.put(hemsireKimID, obj);
        hemsireKimID++;


    }

    @Override
    public void arama() {
        System.out.println("Kimlik ID giriniz");
        hemsireKimID = scan.nextInt();
        if (Hemsire.hemsireListesiMap.containsKey(hemsireKimID)) {
            System.out.println(Hemsire.hemsireListesiMap.get(hemsireKimID));
        } else {
            System.out.println("Giridğiniz kimlik id sistemde kayıtlı değildir");
        }

    }

    @Override
    public void listeleme() {
        Set<Map.Entry<Integer, Hemsire>> hemsireEntrySet = Hemsire.hemsireListesiMap.entrySet();
        System.out.println("------------------------------HEMŞİRE LİSTESİ---------------------------------------");
        System.out.println("kimlik ID   TC No         Ad Soyad         Doğum Yılı       Branş      Sicil No"        +
                "\n-----------------------------------------------------------------------------------");
        for (Map.Entry<Integer,Hemsire> w:hemsireEntrySet) {
            Integer entryKey = w.getKey();
            System.out.printf("%-8d %-8s %15s %10s %15s %10s\n",entryKey,(Hemsire.hemsireListesiMap.get(entryKey).gettCNo()),(Hemsire.hemsireListesiMap.get(entryKey).getAdSoyad()),(Hemsire.hemsireListesiMap.get(entryKey).getDogumYili()),(Hemsire.hemsireListesiMap.get(entryKey).getBrans()),(Hemsire.hemsireListesiMap.get(entryKey).getSicilNo()));
        }
    }

    @Override
    public void silme() {

        System.out.println("Kimlik ID giriniz");
        hemsireKimID = scan.nextInt();
        if (Hemsire.hemsireListesiMap.containsKey(hemsireKimID)) {
            Hemsire.hemsireListesiMap.remove(hemsireKimID);
        } else {
            System.out.println("Giridğiniz kimlik id sistemde kayıtlı değildir");

        }

    }

    @Override
    public void anaMenu() {
        AnaMenu.giris();
    }


    @Override
    public void cikis() {
        System.out.println("Teşekkür ederiz iyi günler");

    }
}
