package hashMap;

import java.util.HashMap;

public class Esercizio4 {
	public static void main(String [] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Mario Malitesta", 25);
		hm.put("Marta Giovannini", 30);
		
		hm.clear();
		
		System.out.println(hm);

	}
}
