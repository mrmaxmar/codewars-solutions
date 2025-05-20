public class Vowels {
    
    public static int vowelCount(String word){
    	int count = 0;
            for (int i=0; i < word.length(); i++){
    	    char letter = word.charAt(i);
/* oringially written if-statement
if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')*/
    	if("aeiou".indexOf(letter) != -1) {
    	count++;}
            }
    return count;}
    
    public static void main(String[] arg){
        String test = "Hello World";
        int num = vowelCount(test);
        System.out.println(num);
    }
}

/*
String vowels = "aeiou";

vowels.indexOf('a')  → 0
vowels.indexOf('e')  → 1
vowels.indexOf('u')  → 4
vowels.indexOf('x')  → -1  ❌ not found
We’re saying:

    "If the variable I named "letter" exists anywhere in the string "aeiou" — it's a vowel."
*/

