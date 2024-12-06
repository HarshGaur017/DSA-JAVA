public class Questions {

    //Reverse a String 
    public static void printRev(String str, int idx){
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }

    //Length Of String
    public static int length(String str){
        if (str.length() == 0) {
            return 0;
        }

        return length(str.substring(1)) + 1;
    }

    //Numbers to digits
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void printDigits(int number){
        if (number == 0) {
            return;
        }

        int lastDigit = number%10;
        printDigits(number/10);
        System.out.println(digits[lastDigit]+" ");
    }

    //Occurence of Key in Array
    public static void AllOccurences(int arr[], int key, int i){
        //Base Case
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i+" ");
        }
        AllOccurences(arr, key, i+1);

    }
    public static void main(String args[]) {

        //Occurence of Key in Array
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key = 2;
        // AllOccurences(arr, key, 0);

        //Numbers to digits
        // printDigits(1947); 
        
        //Length Of String
        // String str = "abcde";
        // System.out.println(length(str));

        //Reverse a String 
        String str = "abcd";
        printRev(str, str.length()-1);

    }
}
