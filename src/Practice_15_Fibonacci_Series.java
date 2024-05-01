import java.util.Scanner;

public class Practice_15_Fibonacci_Series {
    public static void main(String[] args) {
        // Kullanıcıdan girdinin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int num = input.nextInt();
        // Serideki bir sonraki sayı bir önceki sayıya göre hesaplandığı için iki değişken tanımlanmıştır
        int prev = 1;
        int next = 2;
        // Fibonacci serisinin 3 elemandan küçük olduğu durumlarda sorun yaşanmaması için if statement kullanıldı
        if (num == 3) {
            System.out.print(1 + " " + 1 + " " + 2);
        } else if (num == 2) {
            System.out.print(1 + " " + 1);
        } else if ( num == 1) {
            System.out.print(1);
        } else {
             // 3 elemandan fazla her fibonacci serisi 1, 1, 2 şeklinde başladığı için bu sayılar önden bastırılır
            System.out.print(1 + " " + 1 + " " + 2 + " ");
            for (int counter = 3;counter < num;counter++) {
                next += prev;
                prev = next - prev;
                System.out.print(next + " ");
            }
        }
       

    }
}
