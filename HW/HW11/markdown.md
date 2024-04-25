For sake of explanation, let's say that the color at image[sr][sc] is red and we are filling it blue.

We can create a helper function which will fill a cell at [row][column] blue given that it was orginally red.
That helper function will then call itself for its 4 adjacent cells if those cells are not out of bounds. 

In the floodFill() function, we will call the fill function if image[sr][sc] is a different color to the new color.
