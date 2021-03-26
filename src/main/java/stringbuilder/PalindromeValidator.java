package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        if (("").equals(s) || s.isBlank()) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String t = s.toLowerCase();
        for (int i = t.length() - 1; 0 <= i; i--) {
            stringBuilder.append(t.charAt(i));
        }
        return t.equals(stringBuilder.toString());
    }
}
