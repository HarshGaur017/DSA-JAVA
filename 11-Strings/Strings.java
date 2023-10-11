import java.util.*;

public class Strings {
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings Are Immutable
    
    //INPUT & OUTPUT-----------------------------------
        // Scanner sc = new Scanner(System.in);   
        // String name = sc.nextLine();
        // System.out.print(name);
    
    //String Length-----------------------------------
        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

    //String Concatenation-----------------------------------
        // String firstname = "Harsh";
        // String lastname = "Gaur";
        // String fullname = firstname + " " + lastname;
        // System.out.println(fullname);

    //String Char AT Method-----------------------------------
        String firstname = "Harsh";
        String lastname = "Gaur";
        String fullname = firstname + " " + lastname;
        // System.out.println(fullname.charAt(0));

        // printletters(fullname);

    //Largest String Printing
        String fruits[] = {"apple","mango","grapes","banana"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void printletters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    

}