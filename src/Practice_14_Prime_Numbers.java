public class Practice_14_Prime_Numbers {
    public static void main(String[] args) {
        int result = 0;
        // 2 çift sayı olan tek asal sayı olduğu için döngünün dışında başlangıç olarak verildi
        System.out.println(2);
        // i değişkeni 100'e kadar olan sayıları sırayla tutar
        for (int i = 3;i < 100;i++) {
            // i değişkeninden küçük bütün sayıları k tutar ve sırayla i'yi bölmeye çalışır, eğer kalansız bölen bir sayı varsa i sayısı asal değildir ve döngü iptal edilip yeni sayı çekilir
            for ( int k = 2;k < i;k++) {
                if (i % k != 0) {
                    result = i;
                } else {
                    result = 0;
                    break;
                }
            }
            // Eğer kalansız bölen bir sayı varsa sonuç 0 olarak belirlendiği için 0 sayısının ekrana bastırılmaması sağlanır
            System.out.print(result == 0 ? "" : result + "\n");
        }


    }
}
