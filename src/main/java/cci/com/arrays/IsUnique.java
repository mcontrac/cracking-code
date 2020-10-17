package cci.com.arrays;

public class IsUnique {

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

}
