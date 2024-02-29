import java.util.*;
public class multiply_funct {
    public static float multiply(float num1, float num2){
        System.out.print("The product of " + num1 + " and " + num2 + " is " + (num1*num2));
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number : ");
        float b = sc.nextFloat();
        multiply(a,b);
    }
}
