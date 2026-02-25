//  When the array is sorted: TWO SUM BECOMES EASY ---> remember return new int[]{left,right}=========================================================================================================================
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                return new int[]{left,right};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
//Object main me class ka banta hai 
public static void main(String[] args){
  Solution sol = new Solution();
  int[] nums = {1, 2, 3, 4, 6};  // must be sorted
  int target = 6;
  int ans= sol.twoSum(nums,target);
  if (ans.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
}
//===================================================================================================================================================================================================================
