// methods to deal with strings of words.
// all the methods assume that their argument is a string of letters 
// and spaces only, with exactly one space between adjacent words and
// no spaces before the first word or after the last, and the same
// should be true of the strings these methods return.

public class WordByWord{
    
    /**
     * firstWord returns the first word in the String line. If line 
     * is the empty string return the empty string.
     */
    public static String firstWord(String line){
    	if (line.equals("")){
    		return "";
    	}
    	else{
    		line = line + " "; //in case line is one word
    		return line.substring(0, line.indexOf(" "));
    	}
		
    }
    
    /**
     * returns all of line except the first word and the following
     * space.  If line is empty or has only one word, return the empty
     * string, E.g. restOfWords("now is the") should return "is the".
     */
    public static String restOfWords(String line){
    	if (line.equals("") || line.equals(firstWord(line))){
    		return "";
    	}
    	else{
    		line = line.substring(line.indexOf(" ") + 1, line.length()); //line now equals string beginning after space of first word to the end of the string
    		return line;
    	}
    }
    
    /**
     * Assumes word is a single word (no spaces).  Returns the reverse
     * of word, eg revWord("cow") returns "woc"
     */
    public static String revWord(String word){
    	String[] letters = new String[word.length()];
    	String reversedWord = "";
    	for (int i = 0; i < word.length(); i++){
    		letters[i] = word.substring(i, i + 1);
    	}
    	for (int i = letters.length; i > 0; i--){
    		reversedWord = reversedWord + letters[i - 1];
    	}
    	return reversedWord;
    }
    
    /**
     * Reverses a line word-by-word, eg kcabSdrow("now is the time")
     * returns "won si eht emit"
     */
    public static String kcabSdrow(String line){
    	line = line + " ";
    	String[] letters = new String[line.length()];
    	int count = 0; // for tracking the amount of words in line
    	for (int i = 0; i < line.length(); i++){
    		if (line.charAt(i) == ' '){
    			count++;
    		}
    		else{}
    		//loop continues
    	}
    	String[] words = new String[count]; //makes array size the amount of words in line
    	for (int i = 0; i < count; i++){ //stores each word in the array words
    		words[i] = firstWord(line);
    		line = restOfWords(line);	
    	}
    	String kcabSdrow = "";
    	for (int i = 0; i < words.length; i++){
    		kcabSdrow = kcabSdrow + " " + revWord(words[i]); //concatenates reversed word stored in the array  words
    	}
    	return kcabSdrow.trim(); //returns string with first space removed
    }
    
    /**
     * Reverses the words in a line, eg wordsBack("now is the time")
     * returns "time the is now"
     */
    public static String wordsBack(String line){
    	line = line + " ";
    	String[] letters = new String[line.length()];
    	int count = 0; // for tracking the amount of words in line
    	for (int i = 0; i < line.length(); i++){
    		if (line.charAt(i) == ' '){
    			count++;
    		}
    		else{}
    		//loop continues
    	}
    	String[] words = new String[count]; //makes array size the amount of words in line
    	for (int i = 0; i < count; i++){ //stores each word in the array words
    		words[i] = firstWord(line);
    		line = restOfWords(line);	
    	}
    	String wordsBack = "";
    	for (int i = 0, j = words.length - 1; i < words.length; i++, j--){
    		wordsBack = wordsBack + " " + words[j];
    	}
    	return wordsBack.trim();
    }
    
    
    /**
     * old and new are single words.  Replace all copies of oldWord in
     * line with newWord.  E.g., replaceWords("cat", "dog", "a cat
     * "scat cat bye Cat") should return "a dog scat dog bye Cat".
     * Note that only oldWord as a word by itself is replaced, e.g.,
     * not the cat in scat. Note that case matters, e.g., cat does not
     * match Cat.  DO NOT use the built in String methods replace,
     * replaceAll, replaceFirst, or split.
     */
    public static String replaceWords(String oldWord, String newWord, String line){
    	line = line + " ";
    	String[] letters = new String[line.length()];
    	int count = 0; // for tracking the amount of words in line
    	for (int i = 0; i < line.length(); i++){
    		if (line.charAt(i) == ' '){
    			count++;
    		}
    		else{}
    		//loop continues
    	}
    	String[] words = new String[count]; //makes array size the amount of words in line
    	for (int i = 0; i < count; i++){ //stores each word in the array words
    		words[i] = firstWord(line);
    		line = restOfWords(line);	
    	}
    	String replacedWords = "";
    	for (int i = 0; i < words.length; i++){
    		if (words[i].equals(oldWord)){
    			words[i] = newWord;
    		}
    		else{}
    		//on to the next word
    	}
    	for (int i = 0; i < words.length; i++){
    		replacedWords = replacedWords + " " + words[i];
    	}
    	return replacedWords.trim();
    	
    }
    
    /**
     * This is not graded - put any test code here that you want, as long as it
     * compiles without errors in a folder containing only this file and IO.java
     */
    public static void main(String [ ] args){
    	//String test;
    	//System.out.println("oldWord is: ");
    	//String oldWord = IO.readString();
    	//System.out.println("newWord is: ");
    	//String newWord = IO.readString();
    	//test = IO.readString();
    	//System.out.println("First word is: ");
        //IO.outputStringAnswer(firstWord(test));
        //System.out.println("Rest of words is: ");
        //IO.outputStringAnswer(restOfWords(test));
        //System.out.println("reverse word is: ");
        //IO.outputStringAnswer(revWord(test));
        //System.out.println("The string with words reversed is: ");
        //IO.outputStringAnswer(kcabSdrow(test));
        //System.out.println("The string with words in reverse order is: ");
        //IO.outputStringAnswer(wordsBack(test));
        //System.out.println("The replaced words string is: ");
        //IO.outputStringAnswer(replaceWords(oldWord, newWord, test));
    }
}
            

