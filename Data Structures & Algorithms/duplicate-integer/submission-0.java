class Solution {
    public boolean hasDuplicate(int[] nums) {
       
       Set<Integer> numsList = Arrays.stream( nums).boxed().collect( Collectors.toSet());
       if(numsList.size() < nums.length){
        return true;
       }
       return false;
    }
}