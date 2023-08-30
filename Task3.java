package nemetschekErasmus;
class Solution {
    public int findLHS(int[] nums) {
    
    int count=0;
    int result=0;
    int start=0;
    int end=1;
    while((end-1) > nums.length){
        if(nums[end] == nums[start]+1 || nums[end] == nums[start]-1 || nums[end] == nums[start+1]){
            count++;
            end++;
        }else{
            if(count > result){
                result = count;
            }
            end++;
        }     
    }
        return result;
    }
}