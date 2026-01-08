import java.util.*;

public static void convertToBinary(int n) {
    int pow = 0;
    int binary = 0;
    while (n > 0) {
        int rem = n % 2;
        binary = binary + rem * (int) Math.pow(10, pow);
        pow++;
        n = n / 2;
    }
    System.out.println("Binary: " + binary);

}

public static void convertToDecimal(int n) {
    int pow = 0;
    int decimal = 0;
    while (n > 0) {
        int rem = n % 10;
        decimal = decimal + rem * (int) Math.pow(2, pow);
        pow++;
        n = n / 10;
    }
    System.out.println("Decimal: " + decimal);
}

public static void main(String args[]) {
    convertToBinary(10);
    convertToDecimal(1010);
}