class MaximumSubarray {
    public static void main(String[] arg) {

        //Kadane's Algorithm
        //Time Complexity : O(n)
        
        int[] nums = {2,1,-3,4,-1,2,1,-5,4};
        int MaxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for(int i = 0; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]);
            MaxSum = Math.max(MaxSum, curSum);
        }

        System.out.println(MaxSum);
    }
}

/*
        // Brute force approach But it's failed on large array data 
        // Time Complexity : O(n^2)
        // ERROR : Time Limit Exceeded

        int[] nums = {2,1,-3,4,-1,2,1,-5,4};
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (MaxSum < sum) {
                    MaxSum = sum;
                }
            }
        }
        System.out.println(MaxSum);
        */