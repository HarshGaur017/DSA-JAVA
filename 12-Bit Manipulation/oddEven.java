public class oddEven {

    public static void OddorEven(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0)  {
            //Even Number
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        OddorEven(3);
        OddorEven(11);
        OddorEven(4);
    }
}
