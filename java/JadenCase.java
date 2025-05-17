 public class JadenCase {

    public String toJadenCase(String phrase) {
          if (phrase == null || phrase.isEmpty()){
          return null;
          }
              String[] words = phrase.split(" ");

      StringBuilder result = new StringBuilder();
      for (int i = 0; i < words.length; i++){
          String word = words[i];
          String Cap = String.valueOf(Character.toUpperCase(word.charAt(0))) + word.substring(1);
          result.append(Cap).append(" ");
          }
      return result.toString().trim();
  }
    public static void main(String[] args) {
      String MultiWords = "how now brown cow";
      JadenCase jaden = new JadenCase();
      System.out.println(jaden.toJadenCase(MultiWords));
    }
  }