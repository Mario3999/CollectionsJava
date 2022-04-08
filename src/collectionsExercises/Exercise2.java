package collectionsExercises;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
	
	public static void main(String [] args) {
		List<String> myStrings = new ArrayList<String>();
		
		myStrings.add("red");
		myStrings.add("green");
		myStrings.add("blue");
		
		for(String i : myStrings) {
			System.out.println(i);			
		}
		
//		for(int i=0; i<myStrings.size(); i++) {
//			System.out.println(myStrings.get(i));
//		}
		
		
	}
}
