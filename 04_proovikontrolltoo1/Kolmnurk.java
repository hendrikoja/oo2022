import java.util.ArrayList;

public class Kolmnurk {
	ArrayList<Integer> xKoordid = new ArrayList<>();
	ArrayList<Integer> yKoordid = new ArrayList<>();

	public Kolmnurk(ArrayList<Integer> _xKoordid, ArrayList<Integer> _yKoordid) {
		this.xKoordid = _xKoordid;
		this.yKoordid = _yKoordid;
	}

	public void LisaPunkt(int x, int y){
		xKoordid.add(x);
		yKoordid.add(y);
	}

	public double Ymbermoot() {
		double ym = 0;
		double x;
		double y;
		for (int i = 0; i < xKoordid.size(); i++) {
			if (i + 1 == xKoordid.size()) {
				x = Math.abs(xKoordid.get(0) - xKoordid.get(i));
				y = Math.abs(yKoordid.get(0) - yKoordid.get(i));
			} else {
				x = Math.abs(xKoordid.get(i + 1) - xKoordid.get(i));
				y = Math.abs(yKoordid.get(i + 1) - yKoordid.get(i));
			}

			ym += Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		}

		return ym;

	}
}
