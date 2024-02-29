import java.util.Scanner;

public class fibonacci_series {
    public static int fibonacci(int num){
        int second = 0, sum = 0, first = 1;
        System.out.print("0 ");
        for (int i = 0; i <= num; i++){
            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum + " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = sc.nextInt();
        fibonacci(n);
    }

}
