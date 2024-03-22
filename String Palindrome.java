import java.util.*;


public class palindrome {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = input.nextLine();

        int left = 0;
        int right = str.length() - 1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("'" + str + "' is a palindrome.");
        } else {
            System.out.println("'" + str + "' is not a palindrome.");
        }
    }
}