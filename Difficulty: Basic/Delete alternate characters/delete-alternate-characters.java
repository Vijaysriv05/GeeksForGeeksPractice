class Solution {
    static String delAlternate(String s) {
        // code here
        String res="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                char ch=s.charAt(i);
                res+=ch;
            }
        }
        return res;
    }
}