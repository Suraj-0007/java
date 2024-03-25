import java.util.Scanner;

public class camparing_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        if (name1.equals(name2))    // (name1.compareTo(name2) == 0)
        {
            System.out.println("both strings are similar");
        }else{
            System.out.println("both strings are dissimilar");
        }
    }
}
