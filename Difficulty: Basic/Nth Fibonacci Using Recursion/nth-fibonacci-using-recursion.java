class Solution {
    static int nthFibonacci(int n) {
        // code here
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            int temp=a;
          //  System.out.print(a);
            a=a+b;
            b=temp;
        }
        return a;
    }
}
