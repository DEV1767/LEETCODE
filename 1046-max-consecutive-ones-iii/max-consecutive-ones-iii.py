class Solution:
    def longestOnes(self, nums: list[int], k: int) -> int:
        i=0
        zero=0
        maximum=0
        for j in range(len(nums)):
            if nums[j]==0:
                zero+=1
            while zero>k:
                if nums[i]==0:
                    zero-=1
                i+=1
            maximum=max(maximum,j-i+1)
        return maximum
                


            