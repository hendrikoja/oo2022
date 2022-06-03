import java.util.ArrayList;
import java.util.List;

public class Rattahoidla {
	List<Ratas> Rattad = new ArrayList<>();
	
	public void lisaRatas(Ratas r) {
		Rattad.add(r);
	}

	public void prindiFirmaRattad(String firma) {
		for (Ratas r: Rattad) {
			if (r.saaFirma() == firma) {
				System.out.println(r);
			}
		}
	}


}
