import java.util.*;

public class Proov2 {
	public static void main(String[] arg) {
		Map<Integer, String> valvajad = new HashMap<>();
		valvajad.put(1, "Juku");
		valvajad.put(2, "Kati");
		System.out.println(valvajad);
		
		//hinnete Map
		Map<String, Integer> tulemused = new HashMap<>();
		tulemused.put("Juku", 4);
		tulemused.put("Hendrik", 5);
		tulemused.put("Madis", 3);
		
		for (String eesnimi: tulemused.keySet()) {
			System.out.println(eesnimi);
		}
	}
}