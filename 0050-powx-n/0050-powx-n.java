class Solution {
    public double myPow(double x, int n) {
        // Convert to long to handle the Integer.MIN_VALUE edge case safely
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private double fastPow(double x, long n) {
        // Base case
        if (n == 0) {
            return 1.0;
        }
        
        // Recursively calculate the power for half of n
        double half = fastPow(x, n / 2);
        
        // If n is even, (x^(n/2)) * (x^(n/2))
        if (n % 2 == 0) {
            return half * half;
        } 
        // If n is odd, (x^(n/2)) * (x^(n/2)) * x
        else {
            return half * half * x;
        }
    }
}
