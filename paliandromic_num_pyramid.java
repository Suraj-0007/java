public class paliandromic_num_pyramid {
    public static void main(String[] args) {
        int numRows = 5;
        for (int i = 1; i <= numRows; i++) {
            for (int j = numRows - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
