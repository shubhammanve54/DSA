class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total =0;
        int curmax =nums[0],maxsum =nums[0];
         int curmin =nums[0],minsum =nums[0];

         for (int i =0; i<nums.length; i++){
            //increasing total 
            total +=nums[i];
            //skipping the iteration if '0' in the array.
            if(i==0)
            continue;

            //finding max sum 
            curmax=Math.max(nums[i],curmax+nums[i]);
            maxsum=Math.max(maxsum,curmax);

            //finding minsum
            curmin=Math.min(nums[i],curmin+nums[i]);
            minsum=Math.min(minsum,curmin);
            
         }
         if (maxsum < 0)
         return maxsum;

         //this will find maxsum in circular subarray.
         return Math.max (maxsum,total - minsum);

    }
}