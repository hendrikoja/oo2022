public class Kolmnurk implements Kujund{
	double a;
	double b;
	double c;
	
	public Kolmnurk(double kylg1, double kylg2, double kylg3){
		a = kylg1;
		b = kylg2;
		c = kylg3;
	}
	
	public double pindala(){
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public double ymbermoot(){
		return a + b + c;
	}
}