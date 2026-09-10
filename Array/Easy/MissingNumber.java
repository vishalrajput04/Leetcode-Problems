class MissingNumber {
  public static void main(String[] arg) {
    int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    int n = nums.length;
    int sum = n * (n + 1) / 2;
    int arrSum = 0;
    for (int i = 0; i < n; i++) {
      arrSum = arrSum + nums[i];
    }
    System.out.println(sum - arrSum);
  }
}