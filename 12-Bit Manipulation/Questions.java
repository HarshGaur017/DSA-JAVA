public class Questions {

   //Q1- Count Set Bits in a number? ---(Google,Amazon)
    public static int countSetBits(int n){
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { //Check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    //Q5- Find the element that appears once in an array where every other element appears twice?
        public static int findSingle(int ar[], int ar_size){
            int res = ar[0];
            for (int i = 1; i < ar_size; i++) {
                res = res ^ ar[i];
            }
            return res;
        }

    public static void main(String[] args) {
        // System.out.println(countSetBits(15));
    //Q2- Swap two numbers without using third variable?
        // int x = 3, y = 4;
        // x = x^y;
        // y = x^y;
        // x = x^y;
        // System.out.println("after swap: x = "+x + " and y = " + y);

    //Q3- Add 1 to an integer using bit manipulation?
        // int x = 6;
        // System.out.println(x + " + " + 1 + " is " + -~x); 
        // x = -4;
        // System.out.println(x + " + " + 1 + " is " + -~x); 
        // x = 2;
        // System.out.println(x + " + " + 1 + " is " + -~x); 

    //Q4- Convert uppercase letters to lowercase using bits?
        // for(char ch = 'A'; ch<='Z'; ch++){
        //     System.out.println((char) (ch | ' '));
        // }

    //Q5- Find the element that appears once in an array where every other element appears twice?
        int ar[] = {5, 4, 1, 4, 3, 5, 1};
        int n = ar.length;
        System.out.println("Element Occuring Once is " + findSingle(ar, n) + " ");
    }
}
