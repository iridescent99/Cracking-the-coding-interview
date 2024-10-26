import java.util.Arrays;

public class Arrays_and_Strings_1 {

    public boolean isUnique(String str) {
        // No additional data structure allowed
        for (int i =0; i <str.length(); i++){
            char curLet = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if (curLet == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isUniqueBit(String str) {
        // Using bit strings
        return true;
    }

    public boolean isUniqueCharset(String str) {
        // Converting chars to integers and check char_set structure
        return true;
    }

    String sort(String s) {
        char[] arr = s.toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
    public boolean checkPermutation(String str1, String str2) {
        // Given two strings, check if one is a permutation of the other
        // Case sensitive and whitespace is significant

        if (str1.length() != str2.length()) return false;
        if (sort(str1).equals(sort(str2))) return true;
        return true;
    }

    public static void main(String[] args) {
        Arrays_and_Strings_1 cls = new Arrays_and_Strings_1();
        assert cls.isUnique("abcdefghijklmnopqrstuvwxyz") : "Characters are not unique!";
        assert !cls.isUnique("ababa") : "Chars are unique!";
        assert cls.checkPermutation("God", "doG") : "Strings are not permutations";
        assert !cls.checkPermutation("aa wow", "woee") : "These strings are different!";
    }
}
