class Solution {
    public int trailingZeroes(int n) {
        int i=1;int result=0;
        if(n<5){
            return 0;
        }
        while(n>=Math.pow(5,i)){
        result+=(int)n/Math.pow(5,i);
        i++;
        }
    return result;
    }
}