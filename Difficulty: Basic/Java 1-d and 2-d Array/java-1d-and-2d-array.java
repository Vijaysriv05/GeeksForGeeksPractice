class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<a.length;i++){
        
              sum+=a[i][i];
              
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++){
           if(b[i]>max){
               max=b[i];
           } 
        }
      list.add(sum);
      list.add(max);
      return new ArrayList<>(list);
    }
}
