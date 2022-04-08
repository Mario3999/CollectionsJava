package collectionsExercises;
import java.util.ArrayList;
import java.util.List;

public class Exercise13 {
	public static void main(String [] args) {
		List<String> myStrings = new ArrayList<String>();
		
		myStrings.add("red");
		myStrings.add("green");
		myStrings.add("blue");
		System.out.println(myStrings);
		
		List<String> myStrings2 = new ArrayList<String>();
		
		myStrings2.add("yellow");
		myStrings2.add("brown");
		myStrings2.add("black");
	
		System.out.println(myStrings2);

		if(myStrings.size() == myStrings2.size()) {
			
			for(int i =0; i < myStrings.size(); i++) {
				if(myStrings.get(i) == myStrings2.get(i)) {
					System.out.println("Valori all'index "+i+" uguali");
				}
				else {
					System.out.println("Valori all'index "+i+" diversi");
				}
			}
		}else {
			System.out.println("La lunghezza degli arrayList è differente");
		}
		
	
	}

}
