import java.util.Scanner;

public class PalindromRecursion {
    public static int isPalindrome(String A){
        return checkPalindrome(A,0,A.length()-1);
    }

    private static int checkPalindrome(String A,int start,int end) {
        if (start>=end){
            return 1;
        }else if(A.charAt(start)==A.charAt(end)){
            return checkPalindrome(A, start+1, end-1);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(isPalindrome(string));
    }
}
