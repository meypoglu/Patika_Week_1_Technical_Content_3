import java.util.Scanner;

public class Practice_9_ATM_Machine {
    public static void main(String[] args) {
        // Değişkenlerin tanımlanması
        String userName, password;
        int price = 0, right = 3, balance = 1500, select = 0;
        Scanner input = new Scanner(System.in);
        // Kullanıcının giriş hakkı kalıp kalmadığının kontrol edilmesi için en dıştaki loop hak sayısına bağlı çalışıyor
        while (right > 0) {
            // Kullanıcı adı ve şifrenin alınması
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            // Kullanıcı adı ve şifre doğruysa bu bloktan işlemlere geçiliyor
            if (userName.equals("patika") && password.equals("dev123")) {
                // 4 yani çıkış yap seçeneği seçilmediği sürece kullanıcıya işlem yaptırılıyor
                while (select != 4) {
                    System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    // Seçilen işlemlerin çalışması switch bloğu ile sağlanıyor
                    switch (select) {
                        case (1):
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case (2):
                            System.out.print("Para miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case (3):
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        // 4 yani çıkış seçildiğinde programı durdurmak için deneme hakkı 0'a eşitlenir
                        case (4):
                            System.out.println("Tekrar görüşmek üzere.");
                            right = 0;
                            break;
                        // 1, 2, 3, 4 dışında bir sayı girilmesi durumunda bu mesaj görüntülenir
                        default:
                            System.out.println("Yanlış bir sayı girdiniz. Tekrar deneyin.");
                            break;
                    }
                }
                // Yanlış kullanıcı adı ya da şifre girildiğinde buraya ulaşılır ve 1 deneme hakkı eksilir
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
