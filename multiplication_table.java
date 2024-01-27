import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("multiplication table of " + num +" : ");
        for (int i = 1; i<=10; i++){
            int table = num * i;
            System.out.println(num + " X " + i + " = " + table);
        }
    }
}
