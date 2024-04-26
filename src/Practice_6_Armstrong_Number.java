import java.util.Scanner;

public class Practice_6_Armstrong_Number {
    public static void main(String[] args) {
        // Kullanıcıdan girdinin alınması
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int num = input.nextInt();
        // Orjinal sayının değerinin sabit kalması için alınan değeri başka bir değişkene atadım
        int numCalc = num;
        int sum = 0;
        // While döngüsü alınan sayıyı tekrar tekrar 10'a bölerek bir basamak kaydırıyor, % operatörü 10'la bölümden kalanı bulduğu için en sağdaki basamağı elde etmiş oluyoruz. Basamaklar sum değişkeninde toplanıyor ve sonucu hesaplıyor
        while (numCalc > 0) {
            System.out.println("sum değeri: " + sum);
            System.out.println("num değeri: " + numCalc);
            sum += numCalc % 10;
            numCalc /=  10;
        }
        System.out.println(num + " sayısının basamaklarının toplamı: " + sum);
    }
}
