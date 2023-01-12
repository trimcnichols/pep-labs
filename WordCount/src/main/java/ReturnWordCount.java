
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
       
        int wordCount = 1;


        for (int i = 0 ; i <= in.length()-1; i++){
            if(in.charAt(i) == ' ' && in.charAt(i+1) != ' '){
                wordCount++;
            }
        }
        
        return wordCount;
    }
}
