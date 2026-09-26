class Solution {
    public int addDigits(int num) {
        int rem=0;int result=0;
        while(num>0){
            rem=num%10;
            result+=rem;
            num=num/10;
        }
        if(result>9){
           return addDigits(result);
        }
        return result;
    }
}