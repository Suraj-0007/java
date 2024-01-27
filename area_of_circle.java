import java.sql.SQLOutput;
import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.print("Area of the circle is : " + area + " square units");
    }
}
