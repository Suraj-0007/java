import java.util.*;
public class print_index_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2, col = 3;
        int [][] arr = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //for printing the array
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number to find index : ");
        int x = sc.nextInt();
        //for printing the index of number
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (x == arr[i][j]){
                    System.out.println("found at index : (" + i + "," + j + ")");
                }
            }
        }
    }
}