public class Ratas {
    String omanik;
	String firma;
	String tyyp;
	
	public Ratas(String _omanik, String _firma, String _tyyp) {
		this.omanik = _omanik;
		this.firma = _firma;
		this.tyyp = _tyyp;
	}

	public String saaFirma() {
		return firma;
	}

	@Override
	public String toString() {
		return "Omanik: " + omanik + ", Firma: " + firma + ", Tüüp: " + tyyp;
	}

}