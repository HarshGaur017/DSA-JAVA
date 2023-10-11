import java.util.*;

/**
 * Functions
 */
public class Functions {

    public static void printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculatesum(int num1, int num2){ // Parameter or Formal Parameter
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b){
        //Swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public static int factorial(int n){
        int f = 1;

        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;
    }

//FUNCTION OVERLOADING using Parameter----------------------------
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

//FUNCTION OVERLOADING using DATATYPES----------------------------
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }

//CHECK PRIME OR NOT----------------------------
    // public static boolean isPrime(int n){
    //     //Corner Cases
    // if(n == 2){
    //     return true;
    // }
    //     for(int i=2; i<=n-1; i++){
    //         if (n%i == 0) {//Completely Dividing
    //             return false;
    //         }
    //     }
    //     return true;
    // }
//CHECK PRIME OR NOT (OPTIMIZED)----------------------------
    public static boolean isPrime(int n){
        if (n == 2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

//PRINT PRIME NO. IN A RANGE ----------------------------
    public static void primeinrange(int n){
        for(int i=2; i<=n; i++){
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

//DECIMAL TO BINARY ----------------------------------------------
    // public static void decTobin(int n){
    //     int myNum = n;
    //     int pow = 0;
    //     int binNum = 0;
    //     while(n>0){
    //         int rem = n % 2;
    //         binNum = binNum + (rem * (int)Math.pow(10, pow));
    //         pow++;
    //         n = n/2;
    //     }
    //     System.out.println("Binary Form of " + myNum + " = " + binNum);
    // }

//BINARY TO DECIMAL----------------------------------------------
    public static void binTodec(int n){
        int myNum = n;
        int pow = 0;
        int decNum = 0;
        while (n>0) {
            int lastdigit = n % 10;
            decNum = decNum + (lastdigit * (int)Math.pow(2, pow));
            pow++;

            n = n/10;
        }
        System.out.println("Decimal Form of " + myNum + " = " + decNum);
    }
    public static void main(String args[]) {
       //Calculate sum----------------------------
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculatesum(a, b); // here passed a & b are Arguments or Actual Parameter
        // System.out.println("Sum is : " +sum);

       //SWAP----------------------------------------
        // int a = 5;
        // int b = 10;
        // swap(a, b);

       //Product of 2 no.----------------------------------------
        // int a = 10;
        // int b =5;
        // int prod = multiply(a, b);
        // System.out.println("Multiplication is: " + prod);

       //Factorial of a no.----------------------------------------
        // int n = 7;
        // System.out.println(factorial(n));

       //Binomial Coefficent of a no.--------------------------------
        // System.out.println(bincoeff(5, 2));

       //FUNCTION OVERLOADING using Parameter----------------------------
        // System.out.println(sum(10, 5));
        // System.out.println(sum(10, 4, 5));

       //FUNCTION OVERLOADING using DATATYPES----------------------------
        // System.out.println(add(10, 5));
        // System.out.println(add(10.8f, 4.2f));

       //CHECK PRIME OR NOT----------------------------
        // System.out.println(isPrime(2));

       //CHECK PRIME OR NOT (OPTIMIZED)----------------------------
        // System.out.println(isPrime(7));

       //PRINT PRIME NO. IN A RANGE ----------------------------
        // primeinrange(10);

       //DECIMAL TO BINARY ---------------------------------------
        // decTobin(12);

       //BINARY TO DECIMAL----------------------------------------
       binTodec(1011);
    }
}