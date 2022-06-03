import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Harmooniline{
	
	public static double KaheKeskmineKiirus(double k1, double k2){
		return 2 / (1 / k1 + 1 / k2);
	}
	
	public static double KogumKeskmineKiirus(double[] kiirused){
		double keskminekiirus = 0;
		for (int i = 0; i < kiirused.length; i++){
			keskminekiirus += 1 / kiirused[i];
		}
		return kiirused.length/keskminekiirus;
	}
	
	public static double FailKeskmineKiirus(){
		double keskminekiirus = 0;
		int kogus = 0;
		try {
			File kiirustefail = new File("kiirused.txt");
			Scanner s = new Scanner(kiirustefail);
			
			while (s.hasNext()){
				keskminekiirus += 1 / Double.parseDouble(s.next());
				kogus++;
			}
			s.close();
		} catch (FileNotFoundException e){
			return -1;
		}
		return kogus / keskminekiirus;
	}
	
	public static void SalvestaFaili(double kiirus){
		try {
			FileWriter salvestaja = new FileWriter("salvestatudkiirused.txt");
			salvestaja.write(Double.toString(kiirus));
			salvestaja.close();
			System.out.println("Tulemus salvestati faili");
		} catch (IOException e) {
			System.out.println("Salvestamisel tekkis viga");
		}
	}
	
	public static void main(String[] arg){
		System.out.println("Kahe kiiruse keskmine tulemus: " + KaheKeskmineKiirus(10, 60));
		
		double[] kiirused = {20, 30, 40};
		System.out.println("Kogumi keskmine kiirus on: " + KogumKeskmineKiirus(kiirused));
		
		double failikesk = FailKeskmineKiirus();
		System.out.println("Failist saadavate kiiruste keskmine on: " + failikesk);
		SalvestaFaili(failikesk);
		
		
	}
}