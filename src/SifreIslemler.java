import java.util.Scanner;

public class SifreIslemler {
    static Scanner scan=new Scanner(System.in);
    public static void sifreIslem() {
        System.out.println("Lütfen güncel parolanızı giriniz");
        String guncelKey=scan.nextLine();
        if (guncelKey.equals(KullaniciGirisi.key)){
            System.out.println("Lütfen yeni parolanızı giriniz");
            KullaniciGirisi.key=scan.nextLine();
            System.out.println("Parolanız "+KullaniciGirisi.key+" olarak güncellenmiştir");
            AnaMenu.giris();
        }else{
            System.out.println("Kullanıcı adı veya parolanız yanlış");
            sifreIslem();
        }
    }
}
