package cci.com.arrays;

/**
 * Write a method to replace all spaces in a string with %20. you may assume that the string has
 * sufficient space at the end to hold that additional character, and that you are given the "true"
 * length of the string
 *
 * EXAMPLE:
 *  INPUT : 'Mr John Smith    ", 13
 *  OUTPUT: 'Mr%20John%20Smith"
 *
 * @author Milind Contractor
 * @version 1.0
 */
public class URLify {

    /**
     * URLify method has been used to replace the space with %20. TrueLengh is provided because
     * the extra space to has been allocated for extra char require for replacement.
     * @param str
     * @param trueLength
     */
    public char[] urlify(char[] str, int trueLength)
    {
        int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');
        int newIndex = trueLength - 1 + numberOfSpaces * 2;

        /* If there are excess spaces, add a null character. This indicates that the
           Spaces after that point have not been replaces with %20.
         */
        if(newIndex + 1 < str.length) str[newIndex + 1] = '\0';
        for (int oldIndex = trueLength - 1 ; oldIndex >= 0 ; oldIndex -=1) {
            if(str[oldIndex] == ' ') {
                str[newIndex] = '0';
                str[newIndex - 1] = '2';
                str[newIndex - 2] = '%';
                newIndex -= 3;
            }else{
                str[newIndex] = str[oldIndex];
                newIndex -= 1;
            }
        }
        return str;
    }

    /**
     * provide number of target character in the String.
     * @param str
     * @param start
     * @param end
     * @param target
     * @return
     */
    private int countOfChar(char[] str, int start, int end, char target) {
        int count = 0;
        for (int i = start ; i < end ; i++) {
            if(str[i] == target)
                count++;
        }
        return count;
    }

}
