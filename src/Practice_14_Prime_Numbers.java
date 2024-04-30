public class Practice_14_Prime_Numbers {
    public static void main(String[] args) {
        int result = 0;

        System.out.println(2);
        for (int i = 3;i < 100;i++) {
            for ( int k = 2;k < i;k++) {
                if (i % k != 0) {
                    result = i;
                } else {
                    result = 0;
                    break;
                }
            }
            System.out.print(result == 0 ? "" : result + "\n");
        }


    }
}
