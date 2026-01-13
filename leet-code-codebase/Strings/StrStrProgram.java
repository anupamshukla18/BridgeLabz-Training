public class StrStrProgram {

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println("First Occurrence Index = " + strStr(haystack, needle));
    }
}
