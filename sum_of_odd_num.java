import java.util.Scanner;

public class sum_of_odd_num {
    public static int sum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++){
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.print("Sum of odd numbers of given range is "+ sum);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = sc.nextInt();
        sum(n);
    }
}
