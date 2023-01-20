
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char arr1 = 0;
        String[] arr = str.split("");
        for (int i = 0 ; i< arr.length; i++)
        if(arr[i] != arr[i+1]){ 
            arr2 = arr[i+1];
        }
        return ' ';
    }
}
