import java.util.*;

public class intro {
    public static void main(String[] args) {
        // create an array
        int numbers[] = new int[5];
        // input values in array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        // print array elements
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}