import java.util.Scanner;  //Enabling users input.

public class Main {
    public static void main(String[] args) {
        int result = sum(int)
        Scanner int = new Scanner(System.in);  //Intereger is scanner object.
        System.out.println("Enter Intreger " + int);
        // I want to be able to print out intregers and sums.

    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}