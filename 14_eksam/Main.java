public class Main{
	public static void main(String[] args) {
		Grid GameOfLife = new Grid(20, 10);

		/** Stabiilne pulk
		GameOfLife.toggleCoord(7, 4);
		GameOfLife.toggleCoord(5, 4);
		GameOfLife.toggleCoord(6, 4);
		GameOfLife.printGrid();
		 */

		 GameOfLife.randomizeGrid();

		for (int i = 0; i < 50; i++) {
			try {
				GameOfLife.nextGeneration();
				GameOfLife.printGrid();
				Thread.sleep(1000);
			}
			catch (InterruptedException x) {
				return;
			}
		}
	}
}