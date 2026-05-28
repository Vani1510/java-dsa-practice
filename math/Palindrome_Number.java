package math;
import java.util.Scanner;
class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
  
        int originalNum = x; // Store the original number
        int reverse = 0;
        
        while (x != 0) {
            int lastDigit = x % 10; // Extract the last digit
            reverse = reverse * 10 + lastDigit; // Build the reversed number
            x /= 10; // Remove the last digit
        }
        
        return originalNum == reverse; // Compare original and reversed
    }

    public  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }sc.close();
    }
    
}