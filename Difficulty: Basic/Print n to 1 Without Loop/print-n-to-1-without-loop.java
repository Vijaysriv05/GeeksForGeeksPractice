class Solution {
    void printNos(int n) {
        // code here
        print(n,1);
    }
    static void print(int i,int n){
        if(i==0){
            return;
        }
        System.out.print(i+" ");
        print(i-1,n);
    }
}