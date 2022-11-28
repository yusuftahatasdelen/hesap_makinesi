import java.util.Scanner;
public class ucak_bileti {
    public static void main(String[] args) {
        int yas, mesafe, yolculukTipi;
        double yasIndirimOrani, kmBasiUcret = 0.10, yasIndirimi, normalTutar, yasIndirimliTutar, gidisDonusIndirimOrani, toplamIndirimliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Mesafeyi Gİriniz: ");
        mesafe = input.nextInt();
        System.out.print("Lütfen Yolcu Yaşını Giriniz: ");
        yas = input.nextInt();
        System.out.print("Lütfen Yolculuk Tipini Giriniz (Tip 1 = tek yön / Tip 2 = gidiş dönüş) :");
        yolculukTipi = input.nextInt();
        if (( mesafe >= 0) && (yas >= 0) && (yolculukTipi == 1 || yolculukTipi == 2) ){
            if (yas < 12){
                yasIndirimOrani = 0.50;
            }else if (yas <24) {
                yasIndirimOrani = 0.10;
            }else if (yas >= 65){
                yasIndirimOrani = 0.30;
            }else{
                yasIndirimOrani = 0;
            }
            normalTutar = mesafe * kmBasiUcret;
            yasIndirimi = normalTutar * yasIndirimOrani;
            yasIndirimliTutar = normalTutar - yasIndirimi;
            if (yolculukTipi == 1){
                gidisDonusIndirimOrani = 0.20;
                toplamIndirimliTutar = yasIndirimliTutar - (yasIndirimliTutar * gidisDonusIndirimOrani);
            }else{
                gidisDonusIndirimOrani = 0 ;
                toplamIndirimliTutar = yasIndirimliTutar - (yasIndirimliTutar * gidisDonusIndirimOrani);
            }
                System.out.print("bilet tutarınız : " + toplamIndirimliTutar);
            } else {
            System.out.print("Hatalı Bir Değer Girdiniz Tekrar Deneyiniz !!");
        }
        }
    }

