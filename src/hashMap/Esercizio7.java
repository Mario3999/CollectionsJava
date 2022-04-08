package hashMap;

import java.util.HashMap;

public class Esercizio7 {
	public static void main(String [] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Mario Malitesta", 25);
		hm.put("Marta Giovannini", 30);
		
		
		
		System.out.println(hm.get("Marta Giovannini"));
	}
}
