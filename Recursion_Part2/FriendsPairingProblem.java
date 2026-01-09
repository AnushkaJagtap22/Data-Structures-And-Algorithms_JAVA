package Recursion_Part2;

public class FriendsPairingProblem {

    /*
     * Given n friends, each one can remain single or can be paired up with some
     * other friend.
     * Each friend can be paired only once.
     * Find out the total number of ways in which friends can remain single or can
     * be paired up.
     */

    public static int friendsPairing(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total ways in which " + n + " friends can remain single or be paired up is: "
                + friendsPairing(n));
    }
}