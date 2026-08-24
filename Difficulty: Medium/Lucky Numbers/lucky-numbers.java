
class Solution {
     public boolean isLucky(int n) {
         int counter = 2;

         while (counter <= n) {

             // n gets eliminated
             if (n % counter == 0) {
                 return false;
             }

             // Find its new position
             n = n - (n / counter);

             counter++;
         }

         return true;
     }
 }