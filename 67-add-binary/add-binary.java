class Solution {
    public String addBinary(String a, String b) {
        int n = a.length(), m = b.length();
        int maxLen = Math.max(n, m);
        char[] result = new char[maxLen + 1];
        
        int i = n - 1, j = m - 1, k = maxLen;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            result[k--] = (char) ((sum % 2) + '0');
            carry = sum / 2;
        }

        // Return slice starting from k + 1 to skip any leading unused space
        return new String(result, k + 1, maxLen - k);
    }
}