import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // code here
        String big="Big";
        String small="Small";
        if(a>100){
            System.out.print(big);
        }
        else{
            System.out.print(small);
        }
    }
}