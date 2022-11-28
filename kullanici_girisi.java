
import java.util.Scanner;
public class kullanici_girisi {
    public static void main(String[] args) {
        String userName, password, newPassword, passwordChange;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifre Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz yanlış!\n Şifrenizi sıfırlamak ister misiniz(Evet/Hayır)? ");
            passwordChange = input.nextLine();
            if (passwordChange.equals("Evet")) {
                System.out.println("Yeni Şifre giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.println("Eski şifre ile aynı, şifre oluşturulamadı.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else
            {
                System.out.println("Tekrar Deneyiniz");
            }
        }
    }
}