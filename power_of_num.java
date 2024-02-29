import java.util.Scanner;

public class power_of_num {
    public static int power(int x, int n){
        int num = x;
        for (int i = 1; i < n; i++){
            num = num * x;
        }
        System.out.println(num);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.print("Enter the power : ");
        int n = sc.nextInt();
        power(x,n);
    }
}
