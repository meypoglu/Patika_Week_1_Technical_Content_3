import java.util.Scanner;

public class Practice_10_EBOB_EKOK {
    public static void main(String[] args) {
        // Kullanıcıdan girdilerin alınması
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int num1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int num2 = input.nextInt();

        // Değişkenlerin tanımlanması
        int i = 1;
        int k = 1;
        int ebob = 0;
        int ekok = 0;
        // Eğer iki sayı da aynı bölene bölünüyorsa ebob olarak isimlendirilir, döngü devam ettikçe bu değer değişir ve en son alınan değer gerçek EBOB değeridir
        while (i < num1) {
            i++;
            ebob = num1 % i == 0 && num2 % i == 0 ? i : ebob;
        }
        // EKOK hesaplama formülü
        ekok = (num1 * num2 ) / ebob;
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}

