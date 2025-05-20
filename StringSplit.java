import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static void main(String[] args) {
    String input = "abcdefg";
    String[] result = splitIntoPairs(input);

    for (String pairs : result) {
        System.out.println(pairs);}
    }
/*
this for loop is the same as:
    for (int i=0; i < result.length; i++) {
        System.out.println(result[i]);}
    }
They both produce the same result.
*/
    

public static String[] splitIntoPairs(String str) {
    List<String> result = new ArrayList<>();

    for(int i=0; i < str.length(); i+= 2){
        if (i+1 < str.length()) {
		result.add(str.substring(i, i+2));}
        else {result.add(str.charAt(i) + "_");}
    }
	return result.toArray(new String[0]);
}
}



    
