
import java.util.Scanner;
public class sayi{
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        a = inp.nextInt();
        System.out.print("b sayısını giriniz:");
        b = inp.nextInt();
        System.out.print("c sayısını giriniz:");
        c = inp.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("a<b<c");
            } else {
                System.out.print("a<c<b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("b<a<c");
            } else {
                System.out.print("b<c<a");
            }
        } else {
            if (b < a) {
                System.out.print("c<b<a");
            } else {
                System.out.print("c<a<b");
            }
        }
    }
}
