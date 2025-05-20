import java.util.List;
import java.util.ArrayList;

public class FilterList{
    public static List<Integer> filterList(final List<Object> list){
        List<Integer> result = new ArrayList<>();
    
/*
previous for loop:
        for (int i = 0; i < list.size(); i++) {
            Object item = list.get(i);
            if ...
*/
        for (Object item : list) { 
            if (item instanceof Integer) {
                result.add((Integer) item);
            }
        }
        return result;
    }
    public static void main(String[] arg){
        List<Object> mixed = List.of("abc", 1, 4, 15, "23", 12);
        List<Integer> filtered = filterList(mixed);
        
        
        System.out.println("Input: " + mixed);
        System.out.println("Filtered integers: " + filtered);
        
    }
}