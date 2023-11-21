public class UpdateithBit {

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int SetIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int UpdateIthBit(int n, int i, int newbit){

        //Approach 1
        // if (newbit == 0) {
        //     return clearIthBit(n, i);
        // }else{
        //     return SetIthBit(n, i);
        // }

        //Approach 2
        n = clearIthBit(n, i);
        int BitMask = newbit<<i;
        return n | BitMask;
    }

    //Clear I Bits
    public static int clearIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    //Clear BIts in Range
    public static int clearBitsinRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMasK = a | b;
        return n & bitMasK;
    }
    public static void main(String[] args) {
        System.out.println(clearBitsinRange(10, 2, 5));
    }
}
