import java.util.Scanner;

public class circumference_of_Circle {
    public static float circumference(float radius){
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference of the cirlce is : " + circumference);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r = sc.nextFloat();
        circumference(r);
    }
}
