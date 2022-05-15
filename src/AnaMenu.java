import java.util.Scanner;

public class AnaMenu implements AnaMenuInterface {

    static Scanner scan = new Scanner(System.in);
    static int secim;

    public static void giris() {
        AnaMenu obj = new AnaMenu();
        System.out.println("====================================\n" +
                "\t HASTANE YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- DOKTOR İŞLEMLERİ\n" +
                "\t 2- HEMŞİRE İŞLEMLERİ\n" +
                "\t 3- HASTA İŞLEMLERİ\n" +
                "\t 4- ŞİFRE İŞLEMLERİ\n" +
                "\t 5- ÇIKIŞ");

        System.out.println("Lütfen seçiminizi yapınız");

        try {
            secim = scan.nextInt();


            switch (secim) {

                case 1:
                    obj.doktorIslem();
                    break;
                case 2:
                    obj.hemsireIslem();
                    break;
                case 3:
                    obj.hastaIslem();
                    break;
                case 4:
                    obj.sifreIslem();
                    break;
                case 5:
                    obj.cikis();
                    break;
                default:
                    System.out.println("Hatalı giriş lütfen seçimlerden birini giriniz");
            }
        } catch (Exception e) {
            System.out.println("Lütfen sayı giriniz");
            scan.nextLine();
            giris();
        }
    }


    @Override
    public void doktorIslem() {
        DoktorIslemler.doktorIsl();

    }

    @Override
    public void hemsireIslem() {
        HemsireIslemler.hemsireIsl();
    }

    @Override
    public void hastaIslem() {
        HastaIslemler.hastaIsl();
    }

    @Override
    public void sifreIslem() {
        SifreIslemler.sifreIslem();

    }

    @Override
    public void cikis() {
        System.out.println("Teşekkür ederiz iyi günler");

    }
}
