public class Bus{
	
	String name;
	int totalSeats;
	boolean[] seats;
	
	
	public Bus(String initialName, int seatAmount){
		name = initialName;
		totalSeats = seatAmount;
		seats = new boolean[seatAmount];
	}
	
	public String toString(){
		return "Bussi nimi: " + name + ", Kohtade arv: " + totalSeats + ", Vabade kohtade arv: " + getFreeSeats();
	}		
	
	public int getTotalSeats(){
		return totalSeats;
	}
	
	public int getFreeSeats(){
		int count = 0;
		for(int i = 0; i < seats.length; i++){
			if(seats[i] == false){
				count++;
			}
		}
		return count;
	}
	
	public boolean getSeat(int seatNumber){
		return seats[seatNumber];
	}
	
	public void setSeat(int seatNumber, boolean seatState){
		seats[seatNumber] = seatState;
	}
	
}
