class Solution {
  public int maximumProduct(int[] num) {
    final int n = num.length;
    Arrays.sort(num);
    return Math.max(num[n - 1] * num[0] * num[1], num[n - 1] * num[n - 2] * num[n - 3]);
  }
}