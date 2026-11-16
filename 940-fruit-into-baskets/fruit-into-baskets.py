class Solution:
    def totalFruit(self, fruits: list[int]) -> int:
        i = 0
        freq = {}
        max_fruits = 0

        for j in range(len(fruits)):
            freq[fruits[j]] = freq.get(fruits[j], 0) + 1

            while len(freq) > 2:
                freq[fruits[i]] -= 1

                if freq[fruits[i]] == 0:
                    del freq[fruits[i]]

                i += 1

            max_fruits = max(max_fruits, j - i + 1)

        return max_fruits