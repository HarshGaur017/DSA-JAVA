public class RecursionBasics {

    public static void printdec(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }

    public static void printInc(int n){
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }

    public static int calcSum(int n){
        if (n==1) {
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }

    //Calculate Nth Term in Fibonacci Number
    public static int fib(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    //Check if Array is Sorted or not
    public static Boolean isSorted(int arr[], int i){
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    //WAP to find first occurence of element in an array
    public static int FirstOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
         return FirstOccurence(arr, key, i+1);
    }

    //WAP to find last occurence of element in an array
    public static int LastOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    //Print X^N
    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }

        int xnm1 = power(x, n-1);
        int xn = x * xnm1;
        return xn;
    }

    //Optimize Power Function
    public static int optimizePower(int a, int n){
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizePower(a, n/2);
        int halfpowersq = halfpower * halfpower;

        // n is odd
        if (n % 2 != 0) {
            halfpowersq = a * halfpowersq; 
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        
        System.out.println(optimizePower(2, 6));
    }
    
}