package lab7;

public class lab7 {

    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
    /*
    fw = [[distanceThreshold + 1] * n for i in range(n)]

        for i in range(n):
            fw[i][i] = 0

        for i in edges:
            fw[i[0]][i[1]] = i[2]
            fw[i[1]][i[0]] = i[2]

        for k in range(n):
          for i in range(n):
            for j in range(n):
                fw[i][j] = min(fw[i][j], fw[i][k] + fw[k][j])
     */
        int[][] fw = new int[n][n];
        for (int i = 0; i < fw.length; i++){
            for (int j = 0; j < fw.length; j++){
                if (i != j){
                    fw[i][j] = distanceThreshold + 1;
                }
            }
        }

        for (int[] edge : edges) {
            fw[edge[0]][edge[1]] = edge[2];
            fw[edge[1]][edge[0]] = edge[2];
        }

        for (int k = 0; k < n; k++){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    fw[i][j] = Math.min(fw[i][j], fw[i][k] + fw[k][j]);
                }
            }
        }

        /*
        output = -1
        minimum = n + 1

        for city in range(n):
            count = 0
            for neighbor in range(n):

                count += 1 if fw[city][neighbor] <= distanceThreshold else 0

            if count <= minimum:
                output = city
                minimum = count

        return output
         */

        int output = -1;
        int minimum = n + 1;

        for (int city = 0; city < n; city++){
            int count = 0;
            for (int neighbor = 0; neighbor < n; neighbor++){
                if (fw[city][neighbor] <= distanceThreshold){
                    count++;
                }
            }
            if (count <= minimum){
                output = city;
                minimum = count;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        System.out.println(findTheCity(4, new int[][]{{0,1,3},{1,2,1},{1,3,4},{2,3,1}}, 4));
        System.out.println(findTheCity(5, new int[][]{{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}}, 2));
    }
}
