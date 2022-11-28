import java.util.Scanner;
public class artik_yil_hesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Değeri Giriniz: ");
        yil = input.nextInt();
        if(yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.print("Atık Yıl.");
                } else {
                    System.out.print("Atık Yıl Değil.");
                }
            } else {
                System.out.print("Atık Yıl.");
            }
        }else{
            System.out.print("Atık Yıl Değil");
        }
    }
}
