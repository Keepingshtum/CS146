class HW11:
    def floodFill(self, image, sr, sc, color):
        oldColor = image[sr][sc]

        def depth_first(x, y):
            if x < 0 or y < 0 or x >= len(image) or y >= len(image[0]) or image[x][y] == color or image[x][y] != oldColor:
                return
            image[x][y] = color
            depth_first(x + 1, y)
            depth_first(x - 1, y)
            depth_first(x, y + 1)
            depth_first(x, y - 1)

        depth_first(sr, sc)

        return image


hw11 = HW11()
image = [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
print(hw11.floodFill(image, 1, 1, 2))
image = [[0, 0, 0], [0, 0, 0]]
print(hw11.floodFill(image, 0, 0, 0))
