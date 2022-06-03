public class Liikur {
    int kiirus;
	
	public Liikur(int _kiirus) {
		this.kiirus = _kiirus;
	}

	public double TeekonnaLabimisAeg(int teekond) {
		return (double) teekond / (double) kiirus;
	}


}