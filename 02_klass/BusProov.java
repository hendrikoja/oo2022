public class BusProov{
	public static void main(String[] args){
		
		Bus testBus = new Bus("TestBus1", 23);
		Bus testBus2 = new Bus("TestBus2", 50);
		
		testBus.setSeat(10, true);
		testBus.setSeat(20, true);
		
		System.out.println(testBus.getSeat(10));
		System.out.println(testBus.getSeat(11));
		
		System.out.println(testBus2);
		System.out.println(testBus);
	}
}
