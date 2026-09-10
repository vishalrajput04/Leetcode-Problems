class MoveZeroes{
   public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
  public static void main(String[] aegs){
    int[] nums = {0,1,0,3,12};
    int i = 0; 
    int j = 0;      
  
    

   while(j < nums.length){
      
      if(nums[j] != 0){
        swap(nums, i , j);
        i++;
      }
      j++;
   }
   for(int k=0; k < nums.length; k++){
   System.out.print(nums[k] + ",");
   }
  }
}