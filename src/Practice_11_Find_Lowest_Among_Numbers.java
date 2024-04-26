import java.util.Scanner;

public class Practice_11_Find_Lowest_Among_Numbers {
    public static void main(String[] args) {
        // Kullanıcıdan girdilerin alınması
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz ?: ");
        int inpCount = input.nextInt();
        System.out.println("1. sayıyı giriniz: ");
        int inpNum = input.nextInt();
        // En düşük ve yüksek sayıları depolayan değişkenler
        int bankLow = inpNum;
        int bankHigh = 0;
        // İstenen sayıda döngü çalışıp sayıları alır, bir önceki sayıdan büyük ya da küçük olma durumuna göre ilgili değişkenlere değerler girilir
        for (int i = 0;i < inpCount -1;i++) {
            System.out.println(((i + 2) + ". sayıyı giriniz: "));
            inpNum = input.nextInt();
            bankLow = inpNum < bankLow ? inpNum : bankLow;
            bankHigh = inpNum > bankHigh ? inpNum : bankHigh;
        }
        System.out.println("En düşük sayı: " + bankLow);
        System.out.println("En yüksek sayı: " + bankHigh);
    }
}
