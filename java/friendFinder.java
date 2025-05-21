import java.util.List;
import java.util.ArrayList;

public class friendFinder{
	public List<String> friendOrFoe(List<String> names){
	List<String> result = new ArrayList<>();
	for(int i = 0; i < names.size(); i++){
	if (names.get(i).length()== 4) {
		result.add(names.get(i));
      	}
   } 
	return result;
}

public static void main(String[] arg){
      List<String> test = List.of("steve", "paul", "ryans", "Benn", "Al", "A", "12345","Mr.A", "1234");
      friendFinder ff = new friendFinder();
	System.out.println(ff.friendOrFoe(test));
}
}