package hashSet;
import java.util.Set;
import java.util.HashSet;

public class Exercise3 {
	public static void main(String [] args) {
		Set<Integer> myInt = new HashSet<Integer>();
		myInt.add(1);
		myInt.add(2);
		myInt.add(3);
		myInt.add(4);
		myInt.add(5);
		
		System.out.println(myInt.size());
	}
}
