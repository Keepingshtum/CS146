public class Solution {
    public int coinChange(int[] coins, int amount) {
        //minimum number of coins needed to add up to amount
        int[] table = new int[amount + 1];
        for (int i = 0; i < table.length; i++) table[i] = amount + 1;
        table[0] = 0;

        for (int sum = 1; sum < table.length; sum++) {
            for (int c : coins) {
                if (c <= sum && table[sum - c] != amount + 1) {
                    table[sum] = Math.min(table[sum], table[sum - c] + 1);
                }
            }
        }

        return table[amount] == amount + 1 ? -1 : table[amount];
    }
}
