import java.util.Scanner;

public class eligible_to_vote {
    public static int vote(int age){
        if (age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible to vote.");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        vote(age);
    }

}
