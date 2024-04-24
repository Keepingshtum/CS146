class Solution:
    def __init__(self):
        print("HW 11")

    def floodFill(self, image, sr, sc, color):
        if image[sr][sc] != color:
            self.fill(image, sr, sc, image[sr][sc], color)
        return image

    def inBounds(self, image, r, c):
        if r < 0 or r > len(image) - 1:
            return False
        if c < 0 or c > len(image[0]) - 1:
            return False
        return True

    def fill(self, image, r, c, original_color, color):
        if image[r][c] == original_color:
            image[r][c] = color
            if self.inBounds(image, r - 1, c,):
                self.fill(image, r - 1, c, original_color, color)
            if self.inBounds(image, r + 1, c,):
                self.fill(image, r + 1, c, original_color, color)
            if self.inBounds(image, r, c - 1,):
                self.fill(image, r, c - 1, original_color, color)
            if self.inBounds(image, r, c + 1,):
                self.fill(image, r, c + 1, original_color, color)
