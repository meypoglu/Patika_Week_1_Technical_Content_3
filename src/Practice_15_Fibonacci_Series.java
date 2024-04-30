import java.util.Scanner;

public class Practice_15_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int num = input.nextInt();

        int prev = 1;
        int next = 2;
        System.out.print(1 + " " + 1 + " " + 2 + " ");
        for (int counter = 3;counter < num;counter++) {
            next += prev;
            prev = next - prev;
            System.out.print(next + " ");
        }

    }
}
