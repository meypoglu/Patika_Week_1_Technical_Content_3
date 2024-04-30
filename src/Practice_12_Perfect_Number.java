import java.util.Scanner;

public class Practice_12_Perfect_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num2 = input.nextInt();

        int sum = 0;
        for (int i = 1;i < num2;i++) {
          sum += num2 % i == 0 ? i : 0;
          }
        String result = sum == num2 ? (num2 + " mükemmel sayıdır.") : (num2 + " mükemmel sayı değildir.");
        System.out.println(result);

    }
    }

