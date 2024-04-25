public class Solution {
    public Solution () {}

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original_color = image[sr][sc];
        if (original_color != color) {
            fill(image, sr, sc, original_color, color);
        }
        return image;
    }

    private boolean inBounds(int[][] image, int r, int c) {
        if (r < 0 || r > image.length - 1) return false;
        if (c < 0 || c > image[0].length - 1) return false;
        return true;
    }

    private void fill (int[][] image, int r, int c, int original_color, int color) {
        if (image[r][c] == original_color) {
            image[r][c] = color;
            if (inBounds(image,r - 1, c)) fill(image, r - 1, c, original_color, color);
            if (inBounds(image,r + 1, c)) fill(image, r + 1, c, original_color, color);
            if (inBounds(image,r, c - 1)) fill(image, r, c - 1, original_color, color);
            if (inBounds(image,r, c + 1)) fill(image, r, c + 1, original_color, color);
        }
    }
}
