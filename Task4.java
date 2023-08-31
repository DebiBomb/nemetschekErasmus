package nemetschekErasmus;
public class Task4 {

    public static void main(String[] args){

        int[] nums = {4,1,2,1,2};
    
        System.out.println(singleNumber(nums));
    }   

    static public int singleNumber(int[] nums) {

        //int[] numsForCheck = new int[nums.length];
        int n = 0;

        for(int i=0; i<nums.length; i++){
            n ^= nums[i];
        }
        
        return n;
    }
}