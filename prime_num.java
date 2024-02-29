import java.util.Scanner;

public class prime_num {
    public static int prime(int num){
        int count = 0;
        for(int i = 1; i <= num; i++){
            if (num % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println(num + " is a primr number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        prime(num);

    }
}
