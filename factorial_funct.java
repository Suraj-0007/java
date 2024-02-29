import java.util.Scanner;

public class factorial_funct {
    public static int factorial(int num){
        int fact = 1;
        for (int i = num; i >= 1; i--){     // or you can use "for(i = 1; i <= num; i++)" both loop will work.
            fact = fact * i;
        }
        System.out.println(fact);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Factorial of " + a + " is ");
        factorial(a);

    }
}
