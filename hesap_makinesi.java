import java.util.Scanner;
public class hesap_makinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();
        System.out.print("1-Toplama\n+2-Çıkarma\n+3-Çarpma\n+4-Bölme\n");

        System.out.print("İşlem Seçiniz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama: " + (n1 + n2));
                break;

            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;

            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;

            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme: " + (n1 / n2));
                } else {
                    System.out.println("Bir Sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Yanlış bir tuşlama yaptınız.");
        }
    }
}
