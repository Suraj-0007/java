import java.util.*;
public class solid_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s_len = 5;
        for (int i = 1; i <= s_len; i++){
            for (int j = s_len - i; j >= 1; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= s_len; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
