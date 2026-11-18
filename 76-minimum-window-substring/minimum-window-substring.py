class Solution:
    def minWindow(self, s: str, t: str) -> str:
        m = len(s)
        n = len(t)

        if m < n:
            return ""

        i = 0
        need = {}
        window = {}

        formed = 0
        min_length = float('inf')
        start = 0

        for j in range(n):
            need[t[j]] = need.get(t[j], 0) + 1

        required = len(need)

        for j in range(m):
            char = s[j]
            window[char] = window.get(char, 0) + 1

            if char in need and window[char] == need[char]:
                formed += 1

            while formed == required:

              
                if j - i + 1 < min_length:
                    min_length = j - i + 1
                    start = i

                left_char = s[i]

                window[left_char] -= 1

                if left_char in need and window[left_char] < need[left_char]:
                    formed -= 1

                i += 1

        if min_length == float('inf'):
            return ""

        return s[start:start + min_length]