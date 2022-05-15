import java.util.Scanner;

public class KullaniciGirisi {
    static Scanner scan=new Scanner(System.in);
    static final String userName="huseyin.ercik";
    static String key="Emir1234";

    public void kullaniciGirisi(){
        String girilenUserName="";
        String girilenKey="";
        System.out.println("===================HASTANE YONETIMINE HOSGELDINIZ==================");
        System.out.println("Lütfen kullanıcı adınızı giriniz");
        girilenUserName=scan.nextLine();
        System.out.println("Lütfen parolanızı giriniz");
        girilenKey=scan.nextLine();
        if (girilenUserName.equals(userName)&&girilenKey.equals(key)){
            AnaMenu.giris();
        }else {
            System.out.println("Kullanıcı adı veya parolanız yanlış");
            kullaniciGirisi();
        }
    }
}
