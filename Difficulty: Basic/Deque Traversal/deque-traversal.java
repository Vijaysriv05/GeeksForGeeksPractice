class Solution {
    public static void printDeque(ArrayDeque<Integer> deq) {
        // code here
      //  for(int i=0;i<deq.length;i++){
        Iterator<Integer> it=deq.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        
        if(it.hasNext()){
            System.out.print(" ");
        }
        }
        System.out.println();
    }
}