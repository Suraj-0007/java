import java.util.Scanner;

public class even_odd {
    public static int even_odd(int num){
        if (num % 2 == 0){
            System.out.println(num + " is a even number");
        }
        else {
            System.out.println(num + " is a odd number");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        even_odd(num);
    }
}
