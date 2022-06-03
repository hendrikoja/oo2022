public class Proov4 {
	public static void main(String[] args) {
		Arvutaja<String, String> a = new Puhverdaja<String, String>(new EsitaheLeidja());
		System.out.println(a.f("Tere"));
		System.out.println(a.f("Tere"));
		System.out.println(a.f("kere"));
	}
}