class Solution {
    public ArrayList<Integer> gfSeries(int n) {
        // code here
        int firstTerm=0;
        int secondTerm=1;
               ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
 
        for(int i=2;i<n;i++){
            int newterm=(firstTerm*firstTerm)-secondTerm;
            list.add(newterm);
            firstTerm=secondTerm;
            secondTerm=newterm;
        }
        return list;
    }
}