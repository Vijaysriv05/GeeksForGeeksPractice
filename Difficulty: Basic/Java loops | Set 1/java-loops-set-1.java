class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int esum=0;
        int osum=0;
       // if(N==1){
           // esum=0;
           // osum=1;
      //  }
        for(int i=1;i<=N;i++){
            if(i%2==0){
               esum+=i; 
            }
            else{
                osum+=i;
            }
        }
        list.add(esum);
        list.add(osum);
        return new ArrayList<>(list);
    }
}