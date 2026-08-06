import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        // Parse strings as base-2 BigIntegers
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        
        // Add them together
        BigInteger sum = num1.add(num2);
        
        // Convert back to base-2 string
        return sum.toString(2);
    }
}