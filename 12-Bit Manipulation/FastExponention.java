public class FastExponention {

    public static int fastExpo(int a, int n, int x){
        int ans = 1;
        while (n>0) {
            if ((n & 1) != 0) { //check our LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans % x;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5, 7));
    }
}
