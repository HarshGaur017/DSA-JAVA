public class FriendsPairing {

    public static int friendsPairing(int n){
        //Base Case-
        if (n==1 || n==2) {
            return n;
        }

        // //Choices
        // //Single
        // int fnm1 = friendsPairing(n-1);

        // //Pairing
        // int fnm2 = friendsPairing(n-2);
        // int pairingways = fnm1 + (n-1) * fnm2;
        // return pairingways;
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String args[]) {
        System.out.println(friendsPairing(3));
    }
}
