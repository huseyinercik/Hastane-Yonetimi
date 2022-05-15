import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HastaIslemler implements IslemlerInterface {

    static Scanner scan = new Scanner(System.in);
    static int tercih2;
    static int hastaKimID = 5000;

    public static void hastaIsl() {
        HastaIslemler obj = new HastaIslemler();
        System.out.println("============= HASTA İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t 6-ÇIKIŞ\n");

        System.out.println("Lütfen seçiminizi yapınız");

        try {
            tercih2 = scan.nextInt();


            switch (tercih2) {
                case 1:
                    obj.ekleme();
                    hastaIsl();
                    break;
                case 2:
                    obj.arama();
                    hastaIsl();
                    break;
                case 3:
                    obj.listeleme();
                    hastaIsl();
                    break;
                case 4:
                    obj.silme();
                    hastaIsl();
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
            hastaIsl();
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
        System.out.println("Teşhis giriniz");
        String teshis = scan.nextLine();
        Hasta obj = new Hasta(tCNo, adSoyad, dogumYili, teshis);
        Hasta.hastaListesiMap.put(hastaKimID, obj);
        hastaKimID++;

    }

    @Override
    public void arama() {
        System.out.println("Kimlik ID giriniz");
        hastaKimID = scan.nextInt();
        if (Hasta.hastaListesiMap.containsKey(hastaKimID)) {
            System.out.println(Hasta.hastaListesiMap.get(hastaKimID));
        } else {
            System.out.println("Giridğiniz kimlik id sistemde kayıtlı değildir");
        }

    }

    @Override
    public void listeleme() {
        Set<Map.Entry<Integer, Hasta>> hastaEntrySet = Hasta.hastaListesiMap.entrySet();
        System.out.println("-----------------------HASTA LİSTESİ--------------------------------");
        System.out.println("kimlik ID   TC no         Ad Soyad         Dogum Yili       Teshis"        +
                "\n---------------------------------------------------------------------");
        for (Map.Entry<Integer,Hasta> w:hastaEntrySet) {
            Integer entryKey = w.getKey();
            System.out.printf("%-8d %-8s %12s %10s %20s\n",entryKey,(Hasta.hastaListesiMap.get(entryKey).gettCNo()),(Hasta.hastaListesiMap.get(entryKey).getAdSoyad()),(Hasta.hastaListesiMap.get(entryKey).getDogumYili()),(Hasta.hastaListesiMap.get(entryKey).getTeshis()));
        }
    }

    @Override
    public void silme() {
        System.out.println("Kimlik ID giriniz");
        hastaKimID = scan.nextInt();
        if (Hasta.hastaListesiMap.containsKey(hastaKimID)) {
            Hasta.hastaListesiMap.remove(hastaKimID);
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
