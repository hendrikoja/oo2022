public class Proov{
	
	public static double KaksPindalaKorruta(Kujund a, Kujund b){
		return (a.pindala() * b.pindala());
	}
	
	public static void main(String[] arg){
		Kujund kolmnurk = new Kolmnurk(2, 3, 4);
		Kujund ruut = new Ruut(5, 5);
		
		System.out.println("Kolmnurga pindala: " + kolmnurk.pindala());
		System.out.println("Kolmnurga ümbermööt: " + kolmnurk.ymbermoot());
		System.out.println("Ruudu pindala: " + ruut.pindala());
		System.out.println("Ruudu ümbermööt: " + ruut.ymbermoot());
		System.out.println("Ruudu ja kolmnurga pindala korrutis: " + KaksPindalaKorruta(kolmnurk, ruut));
	}
}