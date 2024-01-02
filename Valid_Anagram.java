import java.util.Arrays;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "Listen";
        String t = "Silent";

        boolean isAnagram = isAnagram(s, t);

        System.out.println("Are '" + s + "' and '" + t + "' anagrams are " + isAnagram);
    }

    public static boolean isAnagram(String s, String t) {
        s = s.replace(" ", "");
        t = t.replace(" ", "");
        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
