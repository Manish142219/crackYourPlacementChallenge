class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        if(nums == null || nums.length == 0) {
            return arr;
        }

        Arrays.sort(nums);

        int duplicate = -1;
        int missing = 1; // Initialize missing to 1

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                duplicate = nums[i]; // Found the duplicate
            } else if(nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1; // Found the missing number
            }
        }

        // Check for the last number in the array
        if(nums[nums.length - 1] != nums.length) {
            missing = nums.length; // Update missing if the last number is missing
        }

        arr[0] = duplicate;
        arr[1] = missing;

        return arr;
    }
}
