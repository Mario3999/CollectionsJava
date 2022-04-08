package collectionsExercises;
import java.util.ArrayList;
import java.util.List;

public class Exercise17 {
	public static void main(String [] args) {
		List<String> myStrings = new ArrayList<String>();
		
		myStrings.add("red");
		myStrings.add("green");
		myStrings.add("blue");
		
		myStrings.clear();
		
		System.out.println(myStrings);
	}

}
