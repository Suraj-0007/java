import java.util.Scanner;

public class greater_of_2 {
    public static int greater(int num1, int num2){
        if (num1 > num2){
            System.out.println(num1 + " is greater");
        }else if (num2 > num1){
            System.out.println(num2 + " is greater");
        }else {
            System.out.println("both are equal");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        greater(num1, num2);
    }
}
