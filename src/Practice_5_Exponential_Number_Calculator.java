import java.util.Scanner;

public class Practice_5_Exponential_Number_Calculator {
    public static void main(String[] args) {
        // Kullanıcıdan girdi alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        int num1 = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        int num2 = input.nextInt();
        // Toplamı tutacak değişkenin tanımlanması
        int total = 1;
        // Her döngüde üs olacak sayı 1 azalıyor, değer 0'a ulaştığında for döngüsü duruyor. 0'a ulaşana kadar üssü alınacak sayı çarpım işlemine giriyor
        for (;num2 > 0;num2--) {
            total *= num1;
        }
        System.out.println("Sonuç: " + total);
    }
}
