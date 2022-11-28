
import java.util.Scanner;
public class sinif_gecme_durumu {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("matematik notunuz = ");
        int mat = inp.nextInt();
        if (mat >= 0 && mat <= 100) {
        } else {
            System.out.println("hatalı veri girdiniz");
        }
        System.out.print("fizik notunuz = ");
        int fizik = inp.nextInt();
        if (fizik >= 0 && fizik <= 100) {
        } else {
            System.out.println("hatalı veri girdiniz");
        }
        System.out.print("kimya notunuz = ");
        int kimya = inp.nextInt();
        if (kimya >= 0 && kimya <= 100) {
        } else {
            System.out.println("hatalı veri girdiniz");
        }
        System.out.print("türkçe notunuz = ");
        int turkce = inp.nextInt();
        if (turkce >= 0 && turkce <= 100) {
        } else {
            System.out.println("hatalı veri girdiniz");
        }
        System.out.print("müzik notunuz = ");
        int muzik = inp.nextInt();
        if (muzik >= 0 && muzik <= 100) {
        } else {
            System.out.println("hatalı veri girdiniz");
        }
        double avarage = (mat + fizik + kimya + turkce + muzik) / 5;
        if ((avarage) >=55 ) {
            System.out.println("sınıfı geçtiniz !");
        } else { System.out.println("sınıfı geçemediniz !");
        }
    }
}