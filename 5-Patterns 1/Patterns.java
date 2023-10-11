/**
 * Patterns
 */
public class Patterns {
public static void main(String args[]) {
    //Print Star Pattern-----------------------------
        // for(int line=1; line<=4; line++){
        //     for(int star=1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
    //Print Inverted Star Pattern----------------------------------
        // int n = 10;
        // for(int line=1; line<=n; line++){
        //     for(int star=1; star <= n-line+1; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    //Print Half-Pyramid Pattern----------------------------------
        // int n = 10;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

    //Print Character Pattern----------------------------------
        int n = 6;
        char ch = 'A';

        //outer loop
        for(int line=1; line<=n; line++){
            //inner loop
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
}
    
}