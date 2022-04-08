package hashSet;
import java.util.HashSet;
import java.util.Set;

public class Exercise5 {
	public static void main(String [] args) {
		Set<Integer> myInt = new HashSet<Integer>();
		myInt.add(1);
		myInt.add(2);
		myInt.add(3);
		myInt.add(4);
		myInt.add(5);
		
		System.out.println(myInt.isEmpty());
	}
}
