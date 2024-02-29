import java.util.*;
public class name_funct {
    public static void printMyName(String name){
        System.out.println("Your name is : " + name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String s = sc.next();
        printMyName(s);
    }
}
