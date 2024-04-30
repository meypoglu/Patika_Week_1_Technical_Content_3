import java.util.Scanner;

public class Practice_13_Inverted_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int v1 = input.nextInt();

        for (int i = 0;i < v1;i++) {
            for (int k = 0;k < v1 - i;k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
