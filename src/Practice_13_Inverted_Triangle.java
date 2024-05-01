import java.util.Scanner;

public class Practice_13_Inverted_Triangle {
    public static void main(String[] args) {
        // Kullanıcıdan girdinin alınması
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int v1 = input.nextInt();
        // Alınan sayı kadar satır bastırılması için oluşturulan döngü
        for (int i = 0;i < v1;i++) {
            // Bir satırda bastırılacak yıldız sayısının belirlenmesi için oluşturulan döngü
            for (int k = 0;k < v1 - i;k++) {
                System.out.print("*");
            }
            // Bir alt satıra geçmek için kullanılan String
            System.out.print("\n");
        }
    }
}
