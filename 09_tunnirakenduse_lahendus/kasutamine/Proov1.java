import java.util.*;

public class Proov1 {
	public static void main(String[] arg) {
		List<String> eesnimed = new ArrayList<String>();
		eesnimed.add("Juku");
		eesnimed.add("Mati");
		eesnimed.add("Kati");
		
		System.out.println(eesnimed);
		
		for (String eesnimi: eesnimed) {
			System.out.println(eesnimi);
		}
		
		Iterator<String> it = eesnimed.iterator();
		while(it.hasNext()) {
			String eesnimi = it.next();
			System.out.println(eesnimi);
		}
		
		eesnimed.add("Juku");
		Set<String> nimehulk = new HashSet<>(eesnimed);
		System.out.println(nimehulk);
		
		String[] eesnimemassiiv = nimehulk.toArray(new String[]{});
		System.out.println(eesnimemassiiv[0]);
		
		int jukuKoht = eesnimed.indexOf("Juku");
		if (jukuKoht >= 0) {
			System.out.println("Juku kohal: " + jukuKoht);
		} else {
			System.out.println("Juku puudub");
		}
		
	}
}