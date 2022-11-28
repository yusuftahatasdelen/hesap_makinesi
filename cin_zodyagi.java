import java.util.Scanner;
public class cin_zodyagi {
    public static void main(String[] args) {
        int dogumYili;
        Scanner input = new Scanner(System.in);
        System.out.print("doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();
        switch (dogumYili % 12) {
            case 1 -> System.out.print("Horoz");
            case 2 -> System.out.print("Köpek");
            case 3 -> System.out.print("Domuz");
            case 4 -> System.out.print("Fare");
            case 5 -> System.out.print("Öküz");
            case 6 -> System.out.print("Kaplan");
            case 7 -> System.out.print("Tavşan");
            case 8 -> System.out.print("Ejderha");
            case 9 -> System.out.print("Yılan");
            case 10 -> System.out.print("At");
            case 11 -> System.out.print("Koyun");
            default -> System.out.print("Maymun");
        }
    }
}
