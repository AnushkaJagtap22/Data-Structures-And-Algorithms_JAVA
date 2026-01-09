package Recursion_Part2;

public class RemoveDuplicates {
    public static String removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            return newStr.toString();
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            return removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            return removeDuplicates(str, idx + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder newStr = new StringBuilder();
        boolean[] map = new boolean[26];
        String result = removeDuplicates(str, 0, newStr, map);
        System.out.println("String after removing duplicates: " + result);
    }
}
