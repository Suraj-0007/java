import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("what do you want to do ?");
        System.out.println("for Update bit to 1 type 1 else type 0");
        int operation = sc.nextInt();
        if(operation == 1){
            int newNUM = bitMask | n;
            System.out.println(newNUM);
        }
        else{
            int newBitMask = ~bitMask;
            int newBIt = newBitMask & n;
            System.out.println(newBIt);
        }
    }
}
