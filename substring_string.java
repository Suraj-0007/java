import java.util.Scanner;

public class substring_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(sentence.length());
        String name = sentence.substring(6,sentence.length());
        System.out.println(name);
    }
}
