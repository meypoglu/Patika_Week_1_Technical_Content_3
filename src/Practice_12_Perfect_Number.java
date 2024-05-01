import java.util.Scanner;

public class Practice_12_Perfect_Number {
    public static void main(String[] args) {
        // Kullanıcıdan girdinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num2 = input.nextInt();
    
        int sum = 0;
        // Kendisini kalansız bölen sayıların toplanması
        for (int i = 1;i < num2;i++) {
          sum += num2 % i == 0 ? i : 0;
          }
        // Toplamın sayının kendisine eşit olup olmamasına göre sonucun ekrana verilmesi
        String result = sum == num2 ? (num2 + " mükemmel sayıdır.") : (num2 + " mükemmel sayı değildir.");
        System.out.println(result);

    }
    }

