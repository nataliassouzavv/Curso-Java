import java.util.Scanner;

public class testMerlin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxDigit, u, d, c, m;

        maxDigit = sc.nextInt();


        for (int i = 1000; i <= 9999; i++) {
            u = i % 10;
            d = (i % 100) / 10;
            c = (i % 1000) / 100;
            m = i / 1000;

            if ((u <= maxDigit) && (d <= maxDigit) && (c <= maxDigit) && (m <= maxDigit) && ((u + d + c + m) == 21)) {
                System.out.println(i);
            }
        }
    }

}
