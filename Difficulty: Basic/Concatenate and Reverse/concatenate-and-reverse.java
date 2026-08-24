import java.util.*;
class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String res="";
        res+=s1;
        res+=s2;
    StringBuilder sb=new StringBuilder(res).reverse();
        return sb.toString();
    }
}