
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        List<Integer> list= new ArrayList<Integer>(nums); 
        Collections.sort(list);
        Integer diff = list.get(nums.size()-1) - list.get(0);
        
        return diff;
    }
}
