class Solution {
    public boolean validDigit(int n, int x) {
        if(n<10){
            return false;
        }
        int first=0;
        boolean containsx=false;
        while(n>0){
            int currdig=n%10;
            if(currdig==x){
                containsx=true;
            }
            first=currdig;
            n/=10;
        }
        return containsx&& first!=x;
    }
}