
import java.util.List;
import java.util.ArrayList;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        List<Integer> nums = new ArrayList<Integer>();
        int highest = nums[0];
        int lowest =nums[0];
        for (int i = 0; i < nums.length; i++ ){
            if (nums[i] > largest){
                highest = nums[i];
            }
            if (nums[i] < min){
                lowest = num[i];
            }
            int diff = highest - lowest;
            

        }
        
        return diff;
        
    }
}
