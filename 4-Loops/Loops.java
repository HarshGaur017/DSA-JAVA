import java.util.Scanner;

public class Loops{
    public static void main(String args[]) {
    
    //WHILE LOOP:-

    //HELLO WORLD 100 TIMES-----------------------------------------
        // int counter = 0;
        // while(counter<100){
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println("Printed hello world 100 times");

    //Print No. 1-10-----------------------------------------------
        // int pointer = 1;
        // while(pointer<=10){
        //     System.out.print(pointer+" ");
        //     pointer++;

        // }
        // System.out.println();

    //Print No. 1-N-------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;
        // while(counter<=range){
        //     System.out.print(counter+" ");
        //     counter++;
        // }
        // System.out.println();

    //Print Sum of First n Natural Numbers-----------------------------
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while(i<=n){
        //     sum += i;
        //     i++;
        // }
        // System.out.println("sum is : " +sum);

    
    //FOR LOOP:-

        // for(int i=1; i<=10; i++){
        // System.out.println("Hello World");
        // }

    //Print Square Pattern-----------------------------

        // for(int line=1; line<=4; line++){
        //     System.out.println("****");
        // }

    //Print Reverse of a Number-----------------------------
            
        // int n = 1234567890;

        // while (n>0) {
        //     int lastDigit = n%10;
        //     System.out.print(lastDigit);
        //     n = n/10;
        // }
        
    //Reverse a Given Number-----------------------------
        
        // int n = 10899;
        // int rev = 0;

        // while (n > 0) {
        //     int lastDigit = n%10;
        //     rev = (rev*10) + lastDigit;
        //     n = n/10;
        // }
        // System.out.print(rev);
    
    //DO WHILE LOOP:-

        // int counter = 1;
        // do {
        //     System.out.println("Hello World");
        //     counter++;
        // } while (counter<=10);

    //BREAK IN LOOP:-
        // for(int i = 1; i<=5; i++){
        //     if (i==3) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of loop");

     //Keep Entering Numbers till user enters a multiple of 10-----------------------------
        // Scanner sc = new Scanner(System.in);

        // do {
        //     System.out.print("Enter a Number ");
        //     int n = sc.nextInt();
        //     if (n%10 == 0) {
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);

    //CONTINUE IN LOOP:-
        // for(int i = 1; i<=5; i++){
        //     if (i==3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

    //Display all Numbers entered by user except multiples of 10-----------------------------
        // Scanner sc = new Scanner(System.in);

        // do {
        //     System.out.print("Enter a Number ");
        //     int n = sc.nextInt();
        //     if (n%10 == 0) {
        //         continue;
        //     }
        //     System.out.println(n);
        // } while (true);

    //Check If no. is Prime or Not-----------------------------
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if (n==2) {
                System.out.println("n is prime");
            }else{
                boolean isPrime = true;
                for(int i = 2; i<=Math.sqrt(n); i++){
                    if (n % i == 0) { // n is a multiple of i(i not equal to 1 or n)
                        isPrime = false;
                    }
                }
                if (isPrime == true) {
                    System.out.println("n is prime");
                }else{
                    System.out.println("n is not prime");
                }
            }
    }
}