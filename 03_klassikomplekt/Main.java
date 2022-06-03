public class Main {
    public static void main(String[] args) {
		Rattahoidla hoidla = new Rattahoidla();

		Ratas r1 = new Ratas("Toomas", "Kross", "Hexagon");
		Ratas r2 = new Ratas("Kadri", "Trek", "Marlin");
		Ratas r3 = new Ratas("Mart", "Trek", "Racer");
		Ratas r4 = new Ratas("Valdur", "Kross", "Lea");

		hoidla.lisaRatas(r1);
		hoidla.lisaRatas(r2);
		hoidla.lisaRatas(r3);
		hoidla.lisaRatas(r4);

		hoidla.prindiFirmaRattad("Kross");
		hoidla.prindiFirmaRattad("OlematuFirma");


    }
}