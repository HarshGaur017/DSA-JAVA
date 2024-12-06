public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // transfer top n-1 disks from source to helper using destination as 'Helper'
        towerOfHanoi(n-1, src, dest, helper);
        //transfer nth from source to destination
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        // transfer n-1 disks from helper to destination using source as 'Helper'
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
