public class kata {
  public static String createPhoneNumber(int[] num) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", num[0], num[1], num[2], 
                         num[3], num[4], num[5], num[6], num[7], num[8], num[9]);
  }
  public static void main(String[] args) {
    int[] arr = new int[10];
      System.out.println(createPhoneNumber(arr));
  }
}