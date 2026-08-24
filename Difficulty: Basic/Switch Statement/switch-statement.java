import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res="";
        // code here
        switch (n){
        case 1:
           res+="One";
           break;
        case 2:
            res+="Two";
            break;
        case 3:
            res+="Three";
              break;
        case 4:
            res+="Four";
              break;
        case 5:
            res+="Five";
              break;
        case 6:
            res+="Six";
              break;
        case 7:
            res+="Seven";
              break;
        case 8:
            res+="Eight";
              break;
        case 9:
            res+="Nine";
              break;
        default:
           res+="Unknown";
             break;
        }
    
    System.out.print(res);
}
}