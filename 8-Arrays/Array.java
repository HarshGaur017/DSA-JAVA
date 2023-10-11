public class Array {

//Linear Search-----------------------------------------------
    public static int linear_search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

//Update function in array-----------------------------------------------
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

//Largest No. in array-----------------------------------------------
    public static int getLargest(int numbers[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if (Largest < numbers[i]) {
                Largest = numbers[i];
            }
            if (Smallest > numbers[i]) {
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest no is: "+Smallest);
        return Largest;
    }

//Binary Search Code in array-----------------------------------------------
    public static int binarySearchCOde(int numbers[], int key){
        int start = 0 , end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            //comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key){ // right
                start = mid+1;
            }else{ //left
                end = mid-1;
            }

        }
        return -1;
    }

//Reverse An Array-----------------------------------------------
    public static void reverse_array(int numbers[]){
        int first = 0, last = numbers.length-1;

        while (first < last) {
            //Swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;

        }
    }

//Print Pairs in Array--------------------------------------------
    public static void printpairs(int numbers[]){
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i]; 
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total No. Of Pairs: " + tp);
    }

//Print Subarrays--------------------------------------------
    public static void printSubarray(int numbers[]){
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k]+" ");
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray is: "+ts);
    }

//Maximum Subarrays Sum(BRUTE FORCE METHOD)--------------------------------------------
    public static void maxSubarray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    //Subarray Sum
                    currSum += numbers[k];
                }
               if (maxSum < currSum) {
                    maxSum = currSum;
               }
               
            }
           
        }
        System.out.println("Maximum Subarray is: " + maxSum);
    }

//Maximum Subarrays Sum(PREFIX SUM METHOD)--------------------------------------------
    public static void maxPrefixSubarray(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        
        prefix[0] = numbers[0];
        //Claculate Prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
               if (maxSum < currSum) {
                    maxSum = currSum;
               }
               
            }
           
        }
        System.out.println("Maximum Subarray is: " + maxSum);
    }

//Maximum Subarrays Sum(KADANE'S ALGORITHM)--------------------------------------------
    public static void kadanes(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("MAximum Subarray is : " + ms);
    }

    public static void main(String args[]) {
        //Creating an Array---- dataType arrayName[] = new dataType[size];
        // int marks[] = new int[50];
        // int numbers[] = {1,2,3};
    //Update function in array-----------------------------------------------
        // int marks[] = {97, 98, 99};
        // update(marks);

        // // print our marks
        // for(int i=0; i<marks.length; i++){
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();

    //Linear Search-----------------------------------------------
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        // int key = 20;

        // int index = linear_search(numbers, key);
        // if (index == -1) {
        //     System.out.println("Not FOund");
        // }else{
        //     System.out.println("key is at index: "+index);
        // }

    //Largest No. in array-----------------------------------------------
        // int numbers[] = {1, 2, 3, 6, 5, 4, 19};
        // System.out.println("the Largest no. is: "+getLargest(numbers));

    //Binary Search Code in array------------------------------------------
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        // int key = 14;
        // System.out.println("index of key is: "+binarySearchCOde(numbers, key));

    //Reverse An Array-----------------------------------------------
        // int numbers[] = {2, 4, 6, 8, 10};
        // reverse_array(numbers);
        // //print
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i]+ " ");
        // }
        // System.out.println();

    //Print Pairs in Array--------------------------------------------
        // int numbers[] = {2, 4, 6, 8, 10};
        // printpairs(numbers);

    //Print Subarrays--------------------------------------------
        // int numbers[] = {2, 4, 6, 8, 10};
        // printSubarray(numbers);

    //Maximum Subarrays Sum(BRUTE FORCE METHOD)---------------------
        // int numbers[] = {1, -2, 6, -1, 3};
        // maxSubarray(numbers);

    //Maximum Subarrays Sum(PREFIX SUM METHOD)-----------------------
        // int numbers[] = {1, -2, 6, -1, 3};
        // maxPrefixSubarray(numbers);
  

    //Maximum Subarrays Sum(KADANE'S ALGORITHM)----------------------
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    
    
    
    }
    
}