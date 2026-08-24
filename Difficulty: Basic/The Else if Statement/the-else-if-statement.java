class Solution {
    public static void utility(int number) {
        // Write the if, else if, else statements below
        String big="Big";
        String small="Small";
        String none="Number";
        if(number>100){
            System.out.println(big);
        }
        else if(number<10){
            System.out.println(small);
        }
        else{
            System.out.println(none);
        }
    }
}