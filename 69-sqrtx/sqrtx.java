class Solution {
   public int mySqrt(int x) {
    if (x == 0) return 0;
    int i = 1;
    while ((long)(i + 1) * (i + 1) <= x) {
        i++;
    }
    return i;
}
}