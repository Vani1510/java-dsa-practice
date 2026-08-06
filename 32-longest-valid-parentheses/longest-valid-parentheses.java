class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        
        // Push -1 to serve as the base index before the string starts
        stack.push(-1);
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // If it's an open bracket, push its index
                stack.push(i);
            } else {
                // If it's a close bracket, pop the top element
                stack.pop();
                
                if (stack.isEmpty()) {
                    // The stack becomes empty if we pop an unmatched ')'
                    // We push the current index to act as a new base
                    stack.push(i);
                } else {
                    // If not empty, calculate the valid length
                    
                    int currentLength = i - stack.peek();
                    maxLength = Math.max(maxLength, currentLength);
                }
            }
        }
        
        return maxLength;
    }
}