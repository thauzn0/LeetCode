package leetCode_14_longestCommonPrefix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"Almak", "Arap", "Araba"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        String preFix = strs[0];

        for(int i = 0; i<strs.length;i++){
            while(strs[i].indexOf(preFix) != 0){
                preFix = preFix.substring(0, preFix.length()-1);
            }
        }
        return preFix;


    }
}
