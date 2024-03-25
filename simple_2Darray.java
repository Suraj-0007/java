import java.util.*;
public class simple_2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = 2, size2 = 3;
        int [][] arr = new int[size1][size2];
        for (int i = 0; i < size1; i++){
            for (int j = 0; j < size2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //for printing the array
        for (int i = 0; i < size1; i++){
            for (int j = 0; j < size2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}