import java.util.Scanner;

public class Practice_3_Powers_of_4_and_5 {
    public static void main(String[] args) {
        // Kullanıcıdan girdinin alınması
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sınır sayısı giriniz: ");
        int num = input.nextInt();
        // Her döngüde i 4 ile, j 5 ile çarpılır
        for (int i = 1, j = 1;i < num;i *= 4, j *= 5) {
            // j, i'den daha yüksek değerde olacağı için döngünün erken kesilmesine neden olabilir, bu nedenle döngünün devam koşulunu düşük sayıya göre verdim
            System.out.print(i < num ? i + "\n" : "");
            // j, kullanıcıdan alınan sayıdan düşük olduğu sürece ekrana verilecek, iki kere 1 sayısının basılmaması için j 1 değerini aldığında çıktı vermemesini sağladım
            System.out.print(j < num && j != 1 ? j + "\n" : "");
        }
    }
}
