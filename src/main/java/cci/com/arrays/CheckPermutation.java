package cci.com.arrays;

import java.util.Arrays;

public class CheckPermutation {

    /**
     * check the string has all the same Character.
     * @param str1
     * @param str2
     * @return boolean if both the string has same character in it.
     */
    public boolean permutation(String str1, String str2)
    {
        if(str1.length() != str2.length())
            return false;

        return sort(str1).equals(sort(str2));
    }

    /**
     * This function will sort the string char.
     * @param str String parameter
     * @return String sorted string
     */
    private String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    /**
     * Method to check Permutation with Optimization
     * @param str1
     * @param str2
     * @return
     */
    public boolean permutationOptimized(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        int[] letters = new int[128];
        for (int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            letters[str2.charAt(i)]--;
            if(letters[str2.charAt(i)] < 0)
                return false;
        }
        return true;
    }
}
