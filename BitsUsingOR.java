public class BitsUsingOR {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        int newNUM = bitMask | n;

        if (newNUM == 1){
            System.out.println("bit is one.");
        }
        else{
            System.out.println("bit is zero.");
        }
    }
}
