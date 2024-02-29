import java.util.Scanner;

public class count_positive_negative_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_p = 0;
        int count_N = 0;
        int count_zero = 0;
        while (true) {
            System.out.println("1. enter number \n2. count");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    int n = sc.nextInt();
                    if (n > 0) {
                        count_p++;
                    } else if (n < 0) {
                        count_N++;
                    } else {
                        count_zero++;
                    }

                    break;
                case 2:
                    System.out.println("count of positive numbers : " + count_p);
                    System.out.println("count of Negative numbers : " + count_N);
                    System.out.println("count of zero : " + count_zero);
                    break;
            }
        }

    }
}