package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs){
        StringBuilder result = new StringBuilder();

        //sort the array
        Arrays.sort(strs);

        //get the first and last string
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        //get comparing
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
    public static void main(String args[]) {
        String[] strs = {"flower", "flow", "float"};
        System.out.println(longestCommonPrefix(strs));
    }
}
