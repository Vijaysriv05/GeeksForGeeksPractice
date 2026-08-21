class Solution {
    public int digitalRoot(int n) {
        // code here
        int sum=0;
        while(n>0){
         sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        
        if(sum>9)n=sum;
        else return sum;
        }
        return sum;
    }
};