public class clearBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int newNum = ~bitMask;
        if ((newNum & n) == 1){
            System.out.println("bit is one.");
        }
        else{
            System.out.println("bit is Zero.");
        }

    }
}
