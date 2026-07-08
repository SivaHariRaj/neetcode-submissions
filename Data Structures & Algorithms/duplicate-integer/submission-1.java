class Solution {
    boolean cal(int []arr)
    {
      HashSet<Integer>set=new HashSet<>();
      for(int num:arr)
      {
          if(set.contains(num))
          {
            return true;
          }
          set.add(num);
      }
      return false;
    }
    public boolean hasDuplicate(int[] nums) {
        return cal(nums);
    }
    
}