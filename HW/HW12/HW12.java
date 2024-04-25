import java.util.*;

public class HW12 {
    public static void main(String[] args) {
        int n = 2;

        int[] wells = {1, 1};

        int[][] pipes = { {1, 2, 1}, {1, 2, 2} };

        minCostToSupplyWater(n, wells, pipes);
    }
    public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int[][] pip = Arrays.copyOf(pipes, pipes.length + n);

        for (int i = 0; i < n; i++) {
            pip[pipes.length + i] = new int[] {0, i + 1, wells[i]};
        }

        Arrays.sort(pip, (a, b) -> a[2] - b[2]);
        int[] houses = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            houses[i] = i;
        }

        int result = 0;

        for (var pipe: pip) {
            int house1 = pipe[0];
            int house2 = pipe[1];
            int cost = pipe[2];
            int pa = find(houses, house1);
            int pb = find(houses, house2);
            if (pa != pb) {
                houses[pa] = pb;
                result += cost;

                if (n-- == 0) {
                    return result;
                }
            }
        }

        System.out.println(result);
        return result;
    }

    private static int find(int[] parent, int i) {
        if (parent[i] != i) {
            parent[i] = find(parent, parent[i]);
        }
        return parent[i];
    }
}
