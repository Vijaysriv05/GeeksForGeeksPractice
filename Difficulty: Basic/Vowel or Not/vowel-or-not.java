import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // code here
        char c=Character.toLowerCase(ch);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
}