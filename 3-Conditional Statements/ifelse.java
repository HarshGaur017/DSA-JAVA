import java.util.*;
public class ifelse{
    public static void main(String args[]) {
    
    //AGE---------------------------------------------------
        // int age = 11;
        // if(age>=18){
        //     System.out.println("Adult");
        // }
        // else if( age > 13 && age < 18 ){
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("Not Adult");
        //       }

    //Largest Of 2 Numbers---------------------------------
            // int A = 20;
            // int B = 15;
            // if( A >= B){
            //     System.out.println("A is Largest");
            // } else{
            //     System.out.println("B is Largest");
            // }

    //Number ODD/EVEN--------------------------------------
            //    Scanner sc = new Scanner(System.in);
            //    int num = sc.nextInt();
            //    if( num % 2 == 0){
            //     System.out.println("EVEN");
            //    } else{
            //     System.out .println("ODD");
            //    }
    
    //Largest Of 3 Numbers----------------------------------
                // int a = 15, b = 18, c = 10;
                // if( ( a>=b ) && ( a>=c ) ){
                //     System.out.println("A is Largest");
                // }
                // else if( b >= c){
                //     System.out.println("B is Largest");
                // } else{
                //     System.out.println("C is Largest");
                // }

    //INCOME TAX CALCULATOR--------------------------------------
                    // Scanner sc = new Scanner(System.in);
                    // int income = sc.nextInt();
                    // int tax;
                    // if( income < 500000){
                    //     tax = 0;
                    // }
                    // else if( income >= 500000 && income<1000000 ){
                    //     tax = (int) (income*0.2);
                    // }
                    // else{
                    //     tax = tax = (int) (income*0.3);
                    // }
                    // System.out.println("your tax is " + tax);


    //TERNERY OPERATOR---------------------------------------------------
                    // int num = 7;
                    // String numtype = ( (num%2) ==0)? "Even":"Odd";
                    // System.out.println(numtype);
     //REPORT CARD PROBLEM---------------------------------------------------
                    // int marks = 34;
                    // String reportcard = marks>=33? "Pass" : "Fail";
                    // System.out.println(reportcard);

    //SWITCH CALCULATOR---------------------------------------------------
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter A : ");
                    int a = sc.nextInt();
                    System.out.println("Enter B : ");
                    int b = sc.nextInt();
                    System.out.println("Enter Operator : ");
                    char operator = sc.next().charAt(0);

                    switch(operator){
                        case '+' :
                        System.out.println(a+b);
                        break;

                        case '-' :
                        System.out.println(a-b);
                        break;

                        case '*' :
                        System.out.println(a*b);
                        break;

                        case '/' :
                        System.out.println(a/b);
                        break;

                        default :
                        System.out.println("Not Defined");
                    }

    }

}