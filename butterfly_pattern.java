public class butterfly_pattern {
    public static void main(String[] args) {
        int numRows = 5;
        for (int i = 1; i <= numRows; i++){
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2 * (numRows - i);
            for (int j = 1; j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i = numRows; i >= 1; i--){
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2 * (numRows - i);
            for (int j = 1; j<=spaces;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
