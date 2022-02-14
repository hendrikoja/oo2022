public class Funktsioonid3{
	
	public static double newton_sqrt(double rootable){
		double epsilon = 10E-09;
		double old_sqrt = 1;
		double new_sqrt = (rootable/old_sqrt + old_sqrt)/2;
		
		while(Math.abs(new_sqrt - old_sqrt) > epsilon){
			old_sqrt = new_sqrt;
			new_sqrt = (rootable/old_sqrt + old_sqrt)/2;
		}
		
		return new_sqrt;
	}
	
	public static void main(String[] args){
		System.out.println(newton_sqrt(16));
	}
}
