import java.util.Scanner;

public class length_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.length());

        for (int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i) + " : " + i);
        }

    }
}
