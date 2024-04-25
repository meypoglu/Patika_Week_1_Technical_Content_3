import java.util.Scanner;

public class Practice_1_Even_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        for (int i = 0;i < num;i++) {
            System.out.print((i % 2 == 0) ? i + "\n": "");
        }
    }
}
