package Recursion;

public class FibonacciNumber {
public static int fibonacci(int n)
{
    if(n == 0 )
    {
        return 0 ;
    }
    if(n == 1)
    {
        return 1 ;
    }
    return fibonacci(n-1) + fibonacci(n-2) ;
}
public static void main(String[] args) {
    int n = 7 ;
    System.out.println("The fibonacci number at position " + n + " is : " + fibonacci(n));
}
}