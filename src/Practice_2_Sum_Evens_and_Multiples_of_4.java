import java.util.Scanner;

public class Practice_2_Sum_Evens_and_Multiples_of_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Alınan sayı ve toplam sonuç için tanımlanan değişkenler
        int num = 0, sum = 0;
        // Çift sayı girildikçe devam etme koşuluyla çalışan while döngüsü
        while (num % 2 == 0) {
            // Kullanıcıdan girdinin alınması
            System.out.print("Bir sayı giriniz: ");
            num = input.nextInt();
            // Alınan sayının 4'ün katı olup olmadığının tespit edilmesi
            int result = num % 4 == 0 ? sum += num : 0;
            System.out.println("Girilen sayı: " + num + "\nToplam sonuç: " + sum);
        }
    }
}
