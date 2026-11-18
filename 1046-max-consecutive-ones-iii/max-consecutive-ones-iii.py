class Solution:
    def longestOnes(self, nums: list[int], k: int) -> int:
        i = 0
        maximum = 0
        freq = {}

        for j in range(len(nums)):
            freq[nums[j]] = freq.get(nums[j], 0) + 1

            while freq.get(0, 0) > k:
                freq[nums[i]] -= 1
                i += 1

            maximum = max(maximum, j - i + 1)

        return maximum