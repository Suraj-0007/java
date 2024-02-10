

public class num_pyramid {
    public static void main(String[] args) {
        int numRows = 5;
        for (int i = 1; i <= numRows; i++){
            for (int j = numRows - i; j > 0; j--){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            for (int j = 2; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
