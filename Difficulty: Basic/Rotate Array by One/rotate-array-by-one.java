import java.util.*;
class Solution {
    public void rotate(int[] arr) {
        // code here
        int k=1;
 ArrayList<Integer> list=new ArrayList<>();
  for(int x:arr){
      list.add(x);
  }
  Collections.rotate(list,1);
 
  for(int i=0;i<list.size();i++){
      arr[i]=list.get(i);
     
  }
    }
}