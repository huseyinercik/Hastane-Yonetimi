import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoktorIslemler implements IslemlerInterface {

    static Scanner scan = new Scanner(System.in);
    static int tercih;
    static int doktorKimID = 1000;

    public static void doktorIsl() {
        DoktorIslemler obj = new DoktorIslemler();
        System.out.println("============= DOKTOR İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t 6-ÇIKIŞ\n");

        System.out.println("Lütfen seçiminizi yapınız");

        try {
            tercih = scan.nextInt();


            switch (tercih) {
                case 1:
                    obj.ekleme();
                    doktorIsl();
                    break;
                case 2:
                    obj.arama();
                    doktorIsl();
                    break;
                case 3:
                    obj.listeleme();
                    doktorIsl();
                    break;
                case 4:
                    obj.silme();
                    doktorIsl();
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
            doktorIsl();
        }
    }

        @Override
        public void ekleme () {
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
            Doktor obj = new Doktor(tCNo, adSoyad, dogumYili, brans, sicilNo);
            Doktor.doktorListesiMap.put(doktorKimID, obj);
            doktorKimID++;

        }

        @Override
        public void arama () {
            System.out.println("Kimlik ID giriniz");
            doktorKimID = scan.nextInt();
            if (Doktor.doktorListesiMap.containsKey(doktorKimID)) {
                System.out.println(Doktor.doktorListesiMap.get(doktorKimID));
            } else {
                System.out.println("Giridğiniz kimlik id sistemde kayıtlı değildir");
            }
        }

        @Override
        public void listeleme () {

            Set<Map.Entry<Integer, Doktor>> doktorEntrySet = Doktor.doktorListesiMap.entrySet();
            System.out.println("------------------------------DOKTOR LİSTESİ---------------------------------------");
            System.out.println("kimlik ID   TC No         Ad Soyad         Doğum Yılı       Branş      Sicil No"        +
                    "\n-----------------------------------------------------------------------------------");
            for (Map.Entry<Integer,Doktor> w:doktorEntrySet) {
                Integer entryKey = w.getKey();
                System.out.printf("%-8d %-8s %15s %10s %15s %10s\n",entryKey,(Doktor.doktorListesiMap.get(entryKey).gettCNo()),(Doktor.doktorListesiMap.get(entryKey).getAdSoyad()),(Doktor.doktorListesiMap.get(entryKey).getDogumYili()),(Doktor.doktorListesiMap.get(entryKey).getBrans()),(Doktor.doktorListesiMap.get(entryKey).getSicilNo()));
            }

        }

        @Override
        public void silme () {

            System.out.println("Kimlik ID giriniz");
            doktorKimID = scan.nextInt();
            if (Doktor.doktorListesiMap.containsKey(doktorKimID)) {
                Doktor.doktorListesiMap.remove(doktorKimID);
            } else {
                System.out.println("Giridğiniz kimlik id sistemde kayıtlı değildir");

            }

        }

        @Override
        public void anaMenu () {
            AnaMenu.giris();
        }


        @Override
        public void cikis () {
            System.out.println("Teşekkür ederiz iyi günler");
        }
    }
