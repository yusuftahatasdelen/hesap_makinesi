import java.util.Scanner;

public class hava_durumu {
    public static void main(String[] args) {
        int heat ;
        Scanner inp = new Scanner(System.in);
        System.out.print("sıcaklık değeri giriniz: ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("kayak yapabilirsiniz.");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("sinemaya gidebilirsiniz.");
            }
            if (heat >=10) {
                System.out.println("pikniğe gidebilirsiniz.");
            }
            
        }else {
            System.out.println("yüzmeye gidebilirsiniz.}");
        }


    }
}
