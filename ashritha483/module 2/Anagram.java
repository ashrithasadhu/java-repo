import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = sc.nextLine();
        System.out.print("Enter second string: ");
        String secondString = sc.nextLine();
        if (isAnagram(firstString, secondString)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        sc.close();
    }
    static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }
        int[] charCount = new int[256];

        for (char c : s1.toCharArray()) {
            charCount[c]++;
        }
        for (char c : s2.toCharArray()) {
            charCount[c]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}