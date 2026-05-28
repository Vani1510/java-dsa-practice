package arrays;
import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(j!=i){
                 sum=nums[i]+nums[j];}
                if (sum==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Solution v=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter target");
        int tar=sc.nextInt();
        v.twoSum(num,tar);
    }
}