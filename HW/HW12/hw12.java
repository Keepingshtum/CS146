package hw12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hw12 {
    public static int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        int totalCost = 0;
        int[][] matrix = createMatrix(n, wells, pipes);
        //print(matrix)

        Set<Integer> selected = new HashSet<>(){};
        selected.add(0);

        Set<Integer> other = new HashSet<>(){};
        for (int i = 1; i < n + 1; i++){
            other.add(i);
        }

        while (other.size() > 0){
            int minimum = 100001;
            int a = 0;
            int b = 0;

            for (Integer j : selected){
                for (Integer k : other){
                    if (matrix[j][k] != -1){
                        if (minimum > matrix[j][k]){
                            minimum = matrix[j][k];
                            a = j;
                            b = k;
                        }
                    }
                }
            }
            System.out.println(a + "-" + b + ":" + matrix[a][b]);
            totalCost += matrix[a][b];
            selected.add(b);
            other.remove(b);
        }
        return totalCost;
    }

    private static int[][] createMatrix(int n, int[] wells, int[][] pipes) {
        int[][] matrix = new int[n + 1][n + 1];

        for (int[] i : matrix){
            Arrays.fill(i, -1);
        }

        for (int[] i : pipes) {
            matrix[i[0]][i[1]] = i[2];
            matrix[i[1]][i[0]] = i[2];
        }
        for (int i = 0; i < n; i++) {
            matrix[0][i + 1] = wells[i];
            matrix[i + 1][0] = wells[i];
        }
        return matrix;
    }

    public static void main(String[] args) {
        /*
        n = 2
        wells = [1, 1]
        pipes = [[1, 2, 1], [1, 2, 2]]
        print("total cost: " + str(hw12.minCostToSupplyWater(n, wells, pipes)))

        n = 3
        wells = [1,2,2]
        pipes = [[1,2,1],[2,3,1]]
        print("total cost: " + str(hw12.minCostToSupplyWater(n, wells, pipes)))

        n = 5
        wells=[1,2,2,3,2]
        pipes=[[1,2,1],[2,3,1],[4,5,7]]
        print("total cost: " + str(hw12.minCostToSupplyWater(n, wells, pipes)))*/
        System.out.println(minCostToSupplyWater(2, new int[]{1,1}, new int[][]{{1,2,1},{1,2,2}}));
        System.out.println(minCostToSupplyWater(3, new int[]{1,2,2}, new int[][]{{1,2,1},{2,3,1}}));
        System.out.println(minCostToSupplyWater(5, new int[]{1,2,2,3,2}, new int[][]{{1,2,1},{2,3,1},{4,5,7}}));

    }
}
