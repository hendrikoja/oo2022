public class Auto extends Liikur{
	int maxKaigud;
	int hetkekaik;

	public Auto(int _kiirus, int _maxKaigud) {
		super(_kiirus);
		maxKaigud = _maxKaigud;
		hetkekaik = 1;
	}

	public void TostaKaiku() {
		if (hetkekaik + 1 > maxKaigud) {
			System.out.println("Olete juba kõige kõrgemal käigul!");
		} else {
			hetkekaik += 1;
		}
	}

	public int SaaKaik() {
		return hetkekaik;
	}
	
}
