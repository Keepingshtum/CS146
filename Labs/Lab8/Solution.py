from typing import List

class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        table = [amount + 1] * (amount + 1)
        table[0] = 0

        for sum in range (1, len(table)):
            for c in coins:
                if c <= sum and table[sum - c] != amount + 1:
                    table[sum] = min(table[sum], table[sum - c] + 1)

        if table[amount] == amount + 1:
            return -1
        else:
            return table[amount]
