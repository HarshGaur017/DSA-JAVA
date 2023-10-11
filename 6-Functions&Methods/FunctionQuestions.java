import java.util.Scanner;

public class FunctionQuestions {

//1- Write a Java method to compute the average of three numbers..?
    public static int average(int x, int y, int z){
        return (x + y + z ) / 3;
    }

/*2- Write a method named isEven that accepts an int argument. The method 
should return true if the argument is even, or false otherwise. Also write a program to test your
method.?*/
    public static boolean isEven(int n){
        if (n % 2 == 0) {
            return true;
        }else{
            return false;
        }
        
    }

//3- Write a Java program to check if a number is a palindrome in Java?
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome/10;
            }

            if (n==reverse) {
                return true;
            }
            return false;
        }

//4- Write a Java method to compute the sum of the digits in an integer----
    public static int sumdigit(int n){
        int sum = 0;
        while (n > 0) {
        int lastdigit = n % 10;
        sum = sum + lastdigit;   
        n /= 10;
        }
        return sum; 
    }
    public static void main(String args[]) {
    //1- Write a Java method to compute the average of three numbers..?
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the first no.");
        // int x = sc.nextInt();
        // System.out.println("enter the second no.");
        // int y = sc.nextInt();
        // System.out.println("enter the third no.");
        // int z = sc.nextInt();
        // System.out.println("The Average of Three No. is: " + average(x, y, z));

    //2- Even or not------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The No.");
        // int n = sc.nextInt();
        // if(isEven(n)) {
        //     System.out.println("Number is even");
        // } else{
        //     System.out.println("Number is odd");
        // }

    //3- Write a Java program to check if a number is a palindrome in Java?
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no.: ");
        // int palindrome = sc.nextInt();

        // if (isPalindrome(palindrome)) {
        //     System.out.println("Number : " + palindrome + " is a palindrome");
        // } else {
        //     System.out.println("Number : " + palindrome + " is a not a palindrome");
        // }

    //4- Write a Java method to compute the sum of the digits in an integer---------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer");
        int digits = sc.nextInt();
        System.out.println("Sum of Digits is = " +sumdigit(digits));
    }
}
