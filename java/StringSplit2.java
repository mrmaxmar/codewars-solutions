public class StringSplit2 {
    public static String[] solution(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            s += "_";
        }
    String[] result = new String[s.length()/2];
    for (int i=0; i < s.length(); i+=2){
        result[i/2] = s.substring(i,i+2);
    }
        return result;
    }
    public static void main(String[] arg){
        String[] test = solution("abcdefg");
        for (String pair : test){
            System.out.println(pair);
        }
    }
}