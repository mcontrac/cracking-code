package cci.com.arrays;


public class IsUnique {

    // Brut force way to implement the Unique set of char in String.
    // e.g. "abcdefg" will return true
    // & "abcdeab" will return false
    public boolean isUniqueChars(String str){
        if(str.length() > 128) return false;

        boolean[] charSet = new boolean[128];

        for(int i = 0 ; i < str.length(); i++){
            int val = str.charAt(i);
            if(charSet[val]) {
                return false;
            }
            charSet[val]= true;
        }
        return true;
    }

    public boolean isUniqueCharsOptimize(String str){
        int checker = 0;
        for(int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            if((checker & ( 1 << val)) > 0){
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}
