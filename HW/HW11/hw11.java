package hw11;

import java.io.Console;
import java.util.Arrays;

public class hw11 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        depthFirst(sr, sc, oldColor, color, image);
        return image;
    }

    public static void depthFirst(int x, int y, int oldColor, int newColor, int[][] image){
        if  (x < 0 || y < 0 || x >= image.length || y >= image[0].length || image[x][y] == newColor || image[x][y] != oldColor)
            return;
        image[x][y] = newColor;
        depthFirst(x - 1, y, oldColor, newColor, image);
        depthFirst(x + 1, y, oldColor, newColor, image);
        depthFirst(x, y + 1, oldColor, newColor, image);
        depthFirst(x, y - 1, oldColor, newColor, image);
    }

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));
        image = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
        };
        System.out.println(Arrays.deepToString(floodFill(image, 0, 0, 0)));
    }
}