package collectionsExercises;
import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
	public static void main(String [] args) {
		List<String> myStrings = new ArrayList<String>();
		
		myStrings.add("red");
		myStrings.add("green");
		myStrings.add("blue");
		
		myStrings.set(1, "brown");
		
		System.out.println(myStrings.get(1));
	}

}
