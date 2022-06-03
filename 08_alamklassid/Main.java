public class Main {
    public static void main(String[] args) {

		Liikur rula = new Liikur(10);
		Auto soiduauto = new Auto(120, 5);

		System.out.println("Rulal kuluks teekonna läbimiseks " + rula.TeekonnaLabimisAeg(15) + " tundi.");
		System.out.println("Autol kuluks teekonna läbimiseks " + soiduauto.TeekonnaLabimisAeg(15) + " tundi.");

		System.out.println("Auto hetke käik: " + soiduauto.SaaKaik());
		soiduauto.TostaKaiku();
		System.out.println("Auto hetke käik: " + soiduauto.SaaKaik());

    }
}