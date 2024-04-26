import java.util.Scanner;

public class Practice_8_Diamond_ASCII {
    public static void main(String[] args) {
        // Kullanıcıdan girdinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int n = input.nextInt();
        // programEnder değişkenini while döngüsünü durdurmak için kullandım
        boolean programEnder = false;
        // İlk while döngüsünü elmas oluşana kadar programı devam ettirmek için kullandım
        while (programEnder == false) {
            // i, burada satır numarasını ifade ediyor
            int i = 0;
            // Satır sayısı istenen genişlikten küçükken elmasın üst yarısı oluşturuluyor
            while (i <= n) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
                // Satırı aşağı kaydırmak için i değeri 1 artıyor
                i++;
            }

            i--; // Üst yarı basıldıktan sonra alt yarının sıfırdan başlamaması ve en son basılan satırdan bir eksik yıldız işaretiyle devam etmesi için i 1 azaltıldı
            // Son while döngüsü elmasın alt yarısını bastırmak için kullanılıyor
            while (i > 0) {
                System.out.print(" ");
                // Alt yarının ilk satırında 1 tane boşluk olması gerekiyor, bu da maksimum genişlik -1 kadar yıldız basılması demek. Süreç tersten işliyor
                for (int k = n - i; k > 0; k--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
                i--;
            }

            // Alt yarı da basıldıktan sonra programı durdurmak için programEnder true olarak değiştiriliyor
            programEnder = true;
        }
    }
}