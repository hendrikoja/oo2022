import java.util.ArrayList;

public class Grid {
	int width;
	int height;
	boolean coordGrid[][];
	int generation = 0;

	public Grid(int _height, int _width) {
		this.width = _width;
		this.height = _height;
		coordGrid = new boolean[width][height];
	}

	public void toggleCoord(int x, int y) {
		coordGrid[x][y] = !coordGrid[x][y];
	}

	public boolean[][] getGrid() {
		return coordGrid;
	}

	public boolean getCell(int x, int y) {
		if (x >= 0 && x < width && y >= 0 && y < height) {
			return coordGrid[x][y];
		} else {
			return false;
		}
	}

	public void randomizeGrid() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				coordGrid[i][j] = Math.floor(Math.random() * 4) == 0 ? true : false;
			}
		}
	}

	public int getAliveNeighbours(int x, int y) {
		ArrayList<Boolean> allNeighbours = new ArrayList<>();
		allNeighbours.add(getCell(x - 1, y - 1));
		allNeighbours.add(getCell(x, y - 1));
		allNeighbours.add(getCell(x + 1, y - 1));
		allNeighbours.add(getCell(x - 1, y));
		allNeighbours.add(getCell(x + 1, y));
		allNeighbours.add(getCell(x - 1, y + 1));
		allNeighbours.add(getCell(x, y + 1));
		allNeighbours.add(getCell(x + 1, y + 1));
		return (int) allNeighbours.stream().filter(p -> p == true).count();
	}
	
	//Iga elav rakk vähema kui kahe naabriga sureb
	//Iga elav rakk kahe või kolme naabriga jääb ellu
	//Iga elav rakk rohkema kui kolme naabriga sureb
	//Iga surnud rakk täpselt kolme naabriga tuleb ellu
	public boolean applyGameRules(boolean alive, int neighbours) {
		if (alive) {
			if (neighbours == 2 || neighbours == 3) {
				return true;
			} else if (neighbours < 2) {
				return false;
			} else {
				return false;
			}
		} else {
			if (neighbours == 3) {
				return true;
			} else {
				return false;
			}
		}
	}

	public void nextGeneration() {
		boolean[][] newGrid = new boolean[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				newGrid[i][j] = applyGameRules(coordGrid[i][j], getAliveNeighbours(i, j));
			}
		}
		coordGrid = newGrid;
		generation += 1;

	}

	public void printGrid() {
		System.out.println("GENERATION " + Integer.toString(generation));
		for(int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				System.out.print((coordGrid[i][j] ? "0" : " ") + " ");
			}
			System.out.println("\n");
		}
	}
}
