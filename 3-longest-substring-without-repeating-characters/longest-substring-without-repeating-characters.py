class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        i = 0
        freq = {}
        longest_substring = 0

        for j in range(len(s)):
            freq[s[j]] = freq.get(s[j], 0) + 1

            while freq[s[j]] > 1:
                freq[s[i]] -= 1
                i += 1

            longest_substring = max(longest_substring, j - i + 1)

        return longest_substring