public class ArrayQuestions {

    //Contains Duplicate(Brute Force Approach)--------
    public static boolean containsDuplicate(int nums[]){
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for (int j = i+1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //Search in Rotated Sorted Array--------------
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid-1;
                }else{
                    low = mid-1;
                }
            }else{
                if(target <= nums[high] && target > nums[mid]  ){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }



    public static void main(String args[]) {
     int nums[] = {3,1};
     int target = 1; 
     System.out.println(search(nums, target));       
    }
}
