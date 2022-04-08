package collectionsExercises;
import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
	public static void main(String [] args) {
		List<String> myStrings = new ArrayList<String>();
		
		myStrings.add("red");
		myStrings.add("green");
		myStrings.add("blue");
		
		myStrings.add(0, "yellow");
		
		for(String i : myStrings) {
			System.out.println(i);			
		}
		
	}
}
