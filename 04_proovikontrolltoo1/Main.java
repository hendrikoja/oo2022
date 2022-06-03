import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

		ArrayList<Integer> algX = new ArrayList<>();
		ArrayList<Integer> algY = new ArrayList<>();

		algX.add(2);
		algX.add(5);
		algX.add(6);
		
		algY.add(8);
		algY.add(1);
		algY.add(2);

		ArrayList<Integer> algX2 = new ArrayList<>();
		ArrayList<Integer> algY2 = new ArrayList<>();

		algX2.add(5);
		algX2.add(9);
		algX2.add(11);
		
		algY2.add(8);
		algY2.add(1);
		algY2.add(2);

		Kolmnurk k1 = new Kolmnurk(algX, algY);
		Kolmnurk k2 = new Kolmnurk(algX2, algY2);
		System.out.println(k1.Ymbermoot());
		System.out.println(k2.Ymbermoot());

		k1.LisaPunkt(15, 3);
		k2.LisaPunkt(9, 3);

		System.out.println(k1.Ymbermoot());
		System.out.println(k2.Ymbermoot());

    }
}