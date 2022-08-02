class Solution {
     public int kthSmallest(int[][] matrix, int k) {
    int n = matrix.length, lo = matrix[0][0], hi = matrix[n - 1][n - 1];
    // lo < hi , not lo <= hit
    while (lo < hi) {
      int mid = lo + (hi - lo) / 2;
      int count = lessEqual(matrix, mid);
      if (count < k)
        lo = mid + 1;
        //
      else
        hi = mid;
    }
    return lo;


  }

  //  from left-bottom or right-top can count how much numbers are less equal than target
  public int lessEqual(int[][] matrix, int target) {
    int cnt = 0, N = matrix.length, i = N - 1, j = 0;
    while (i >= 0 && j < N) {
      if (matrix[i][j] > target)
        i--;
      else {
        cnt = cnt + i + 1;
        j++;
      }
    }
    return cnt;
  }

}