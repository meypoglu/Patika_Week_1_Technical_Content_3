import java.util.Scanner;

public class Practice_7_Harmonic_Numbers {
    public static void main(String[] args) {
        // Kullanıcıdan girdinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        // Sonuç değişkeninin oluşturulması
        double result = 0;
        // Döngüde verilen sayıya kadar i değer alır ve 1 ile bölümü sonuca eklenir
        for (int i = 1;i <= num;i++) {
            result += (double) 1 / i;
        }
        System.out.println("Sonuç: " + result);
    }
}
