import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Practice_4_Factorial_Calculator {
    public static void main(String[] args) {
        // Kullanıcıdan değerlerin alınması
        Scanner input = new Scanner(System.in);
        System.out.println("Kümenin eleman sayısını (n) giriniz: ");
        int n = input.nextInt();
        System.out.println("Oluşacak grupların eleman sayısını (r) giriniz: ");
        int r = input.nextInt();
        // Faktöriyelleri ayrı ayrı hesaplamak için hepsine bir sonuç değişkeni atadım. Sayılar fazla büyüyebildiği için long yerine BigInteger veri tipini kullandım
        BigInteger ntotal = BigInteger.valueOf(1), rtotal = BigInteger.valueOf(1), nrtotal = BigInteger.valueOf(1);
        // n, r ve n-r'nin faktöriyel hesaplamaları
        for (int i = 1; i <= n; i++) {
            ntotal = ntotal.multiply(BigInteger.valueOf(i));
        }
        for (int j = 1; j <= r; j++) {
            rtotal = rtotal.multiply(BigInteger.valueOf(j));
        }
        for (int d = 1; d <= (n - r); d++) {
            nrtotal = nrtotal.multiply(BigInteger.valueOf(d));
            }
        // Sonucun hesaplanması
        BigInteger result = ntotal.divide(rtotal.multiply(nrtotal));
        System.out.println("Sonuç: " + result);
    }
}
