public class Ruut implements Kujund{
	double a;
	double b;
	
	public Ruut(double kylg1, double kylg2){
		a = kylg1;
		b = kylg2;
	}
	
	public double pindala(){
		return a * b;
	}
	
	public double ymbermoot(){
		return 2 * (a + b);
	}
}