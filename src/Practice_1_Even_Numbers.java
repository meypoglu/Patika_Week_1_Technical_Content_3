import java.util.Scanner;

public class Practice_1_Even_Numbers {
    public static void main(String[] args) {
        // Kullanıcıdan girdi alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        // Döngüde girilen sayıya kadar i değerini artırarak ilerler
        for (int i = 0;i < num;i++) {
            // Sayının 2'ye bölümünden kalan 0 ise ekrana verilir
            System.out.print((i % 2 == 0) ? i + "\n": "");
        }
    }
}
