package LeetCode;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                candidate = nums[i];
            }

            if(nums[i] == candidate){
                count++;
            }
            else {
                count--;
            }
        }
        return candidate;

    }

    public static void main(String[] args) {
        int nums[] = new int[]{3,3,2,4,4,4};
        System.out.println(majorityElement(nums));
    }
}
