import java.util.Scanner;

public class mul_table {
    public static int table(int num){
        int mult = 1;
        for (int i = 1; i <= 10; i++){
            mult = num * i;
            System.out.println(num + " * " + i + " = " + mult);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("multiplication table of " + n);
        table(n);
    }
}
