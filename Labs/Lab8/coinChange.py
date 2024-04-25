from typing import List

class Coin:
    def coinChange(self, coins: List[int], amount: int) -> int:
        
        # We use amount + 1 because we want a the array size to account for sum = 0
        # and we want each set to be amount + 1 because we want each slot to be a
        # number we cannot reach
        
        amountCoins = [amount + 1] * (amount + 1)
        amountCoins[0] = 0
        
        # We iterate through each amount up to amount + 1 so we can check for the amount
        # of coins that add up to each value, i.e, how many coins add up to 5 when the amount
        # is equal to 11
        for i in range(1, amount + 1):
            
            # We iterate through the coins given, for example if you are given 1 cent coin,
            # 2 cent coin, and 5 cent, we iterate through the coins and only when it fulfills
            # the condition for if coin <= i, then we start updating values
            for coin in coins:
                if coin <= i:
                    
                    # This is the main part of the dynamic programming logic
                    # We update amount coins[i] by deciding the minimum value between
                    # either the inital amount of coins, or the amount of coins at i - coin then
                    # plus one. The plus one is the accounting for the current coin we are on
                    amountCoins[i] = min(amountCoins[i], amountCoins[i - coin] + 1)
                    
        # This is to check if it is possible for the coins to add up to the amount
        # If it is impossible, i.e., when coins add up to amount + 1 then we return -1
        if amountCoins[amount] <= amount:
            return amountCoins[amount]
        else:
            return -1

coin = Coin()

# Initially, the array is [0, 9, 9, 9, 9, 9, 9, 9, 9]
# At i = 1, only coin 1 <= i, so the code runs as
# amountCoins[1] = min(9, amountCoins[0] + 1) which becomes
# amountCoins[1] = min(9, 1) and it chooses one because it is smaller
# Array updates: [0, 1, 9, 9, 9, 9, 9, 9, 9]
# At i = 2, both coin 1 and coin 2 fits, so it runs like
# for coin 1: amountCoins[2] = min(9, amountCoins[2 - 1] + 1) equals 2
# for coin 2: amountCoins[2] = min(9, amountCoins[2 - 2] + 1) equals 1
# So amountCoins[2] = 1 because only one Coin 2 is needed
# Array updates: [0, 1, 1, 9, 9, 9, 9, 9, 9]
# At i = 8, coin 1, 2, and 5 fit, so:
# for coin 1: amountCoins[8] = min(amountCoins[8], amountCoins[8 - 1] + 1) equals 3
#       amountCoins[8-1] + 1 = amountCoins[7] + 1 and amountCoins[7] is equal to 2 from previous
#       calculations from the previous updates
# for coin 2: amountCoins[8] = min(amountCoins[8], amountCoins[8 - 2] + 1) equals to 3
# for coin 5: amountCoins[8] = min(amountCoins[8], amountCoins[8 - 5] + 1) equals to 3
coins = [1,2, 5]
amount = 11
print("Pass Example: ")
print(coin.coinChange(coins, amount))

# Starts running at i = 5 because coin <= i
# At i = 5,
# amountCoins[5] = min(amountCoins[5], amountCoins[5 - 5] + 1) = min(7, 0 + 1) = 1
# At i =6,
# amountCoins[6] = min(amountCoins[6], amountCoins[6 - 5] + 1) = min(7, 7 + 1) = 7
# Therefore amountCoins[amount] does not <= to amount and we return -1
coins = [5]
amount = 7
print("Fail Example: ")
print(coin.coinChange(coins, amount))