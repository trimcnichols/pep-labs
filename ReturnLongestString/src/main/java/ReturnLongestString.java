
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int i;
        String  str;
        int longestStr = 0;
        String longestString ="";
        for(i =0 ;i< arr.length; i++){
            str =arr[i];
            if( str.length() >  longestStr){
                longestStr = str.length();
               longestString = arr[i];

            }
        }
       
        return longestString;
    }
}
