import java.util.Scanner;

public class Practice_Casting {
    public static void main(String[] args) {
        // Kullanıcıdan girdilerin alınması
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        int intNum = input.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz: ");
        float floNum = input.nextFloat();
        // Float değer integer'a, integer olan değer float'a dönüştürülüp değişkenlere atanır
        float intNew = (float) intNum;
        int floNew = (int) floNum;

        System.out.println(intNew + " " + floNew);
    }
}
