import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("1. Addition\n2. Subtraction\n3.Multiplication\n4. Division\n5. Modulus");
        int button = sc.nextInt();

        switch (button){
            case 1:
                System.out.println("Addition of two numbers is " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction of two numbers is " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication of two numbers is " + (num1 * num2));
                break;
            case 4:
                System.out.println("Division of two numbers is " + (num1 / num2));
                break;
            case 5:
                System.out.println("Modulus of two numbers is " + (num1 % num2));
                break;
        }

    }
}
