package Strings;

public class uppercase {
    public static String toUpperCaseString(String str) {
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            char ch1 = Character.toUpperCase(str.charAt(i));
            sb.append(ch1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        String upperStr = toUpperCaseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + upperStr);
    }
}
