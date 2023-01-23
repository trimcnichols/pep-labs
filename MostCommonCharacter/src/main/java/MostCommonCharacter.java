import java.util.*;
import java.util.Map.Entry;


public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
        String joinedstr = String.join(" ", str);
         Character maxappearchar =' ';
         for (int i = 0; i < joinedstr.length(); i ++){
             if ( map.containsKey(joinedstr.charAt(i)))
              {
                    map.put (joinedstr.charAt(i), map.get(joinedstr.charAt(i)) + 1 );
              }       
              else
              {
                map.put (joinedstr.charAt(i), 1);
              }           
         }  
     
         // Got the number of maximum occuarance
  Integer maxNum = Collections.max(map.values());

    // Iterate to search the result.
    
 for (Entry<Character, Integer> entry : map.entrySet()) {
       
        if(maxNum == entry.getValue()){
            maxappearchar=entry.getKey();
        }
    }
            return maxappearchar;
           
    }
}
