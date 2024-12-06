public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 10, 15};
        int n = arr.length;
        int X = 2, Y = 3;

        int totalJumps = calculateTotalJumps(arr, n, X, Y);
        System.out.println("The total number of jumps needed is: " + totalJumps);
    }

    public static int calculateTotalJumps(int[] arr, int n, int X, int Y) {
        int jumps = 0;

        for (int i = 0; i < n; i++) {
            int reach = X;
            while (reach < arr[i]) {
                reach += X - Y;
                jumps++;
            }
            if (reach == arr[i]) {
                jumps++;
            }
        }

        return jumps;
    }
}