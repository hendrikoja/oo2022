public class Proov1 {
	public static void main(String[] arg) {
		SamaTyypiPaar<Integer> asukoht = new SamaTyypiPaar<>();
		asukoht.esimene = 7;
		asukoht.teine = 4;
		System.out.println(asukoht);
		
		SamaTyypiPaar<String> nimed = new SamaTyypiPaar<>();
		nimed.esimene = "AAAAAA";
		nimed.teine = "BBBBB";
		System.out.println(nimed);
		
	}
}