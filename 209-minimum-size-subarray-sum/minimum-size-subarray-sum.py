class Solution:
    def minSubArrayLen(self, target: int, nums: list[int]) -> int:
        i=0
        win_sum=0
        min_length=float('inf')
        for j in range(len(nums)):
            win_sum+=nums[j]
            while(win_sum>=target):
                min_length=min(min_length,j-i+1)
                win_sum-=nums[i]
                i+=1
        return 0 if min_length==float('inf') else min_length

            
            