package LeetCode;
public class pivotIndex {
    public static void main(String[] args) {
        int nums [] = {1,7,3,6,5,6};
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        int leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                System.out.println(i);
            }
            leftSum+=nums[i];
        }
    }
}
