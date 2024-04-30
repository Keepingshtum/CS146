MATRIX_MULTIPLY(A, B): 
  if columns(A) ≠ rows(B): //exicuted one time
    raise ValueError("Matrix multiplication is not defined.")  // O(1) - basic dimension check

  rows_A ← number of rows in A //O(1) - getting the dimensions
  cols_A ← number of columns in A //O(1) - getting the dimensions
  cols_B ← number of columns in B //O(1) - getting the dimensions
  result ← matrix of size rows_A x cols_B filled with zeros  //O(rows_A * cols_B) - initializing result matrix

  for i from 1 to rows_A do:  // O(rows_A) - iterating over each row of A
    for j from 1 to cols_B do:  // O(cols_B) - iterating over each column of B
      sum ← 0  // O(1) - initializing the sum for the dot product
      for k from 1 to cols_A do:  // O(cols_A) - iterating over elements for dot product
        sum ← sum + A[i][k] * B[k][j]  // O(1) for each multiplication and addition, but inside O(cols_A) loop
      result[i][j] ← sum  // O(1) - assigning computed sum to result matrix
  return result  // O(1) - returning the result

//overall The pseudocode for matrix multiplication has an O(mnp) time complexity
due to the triple nested loops that perform dot products for each element in the result matrix.

N^3 time complexity