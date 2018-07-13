package JavaForKids;

import java.time.LocalDate;
import java.time.Month;

public interface Swimable {
	final static int MAX_DEPTH = 10; // in feet;
	public void swim(int gowFar);
	
	public default void dive(int howDeep){
		if(howDeep <= MAX_DEPTH && isSummer()){
			System.out.println("Okey, will dive, the water should be warm!");
		}else if(howDeep > MAX_DEPTH){
			System.out.println("Can't dive into this depth.");
		}
		else {
			System.out.println("Can't dive sorry. The water's cold for diving.");
		}
	}
	
	
	// Check if it summer now
	
	static boolean isSummer(){
		Month month = LocalDate.now().getMonth();
		if(month == Month.JUNE || month == Month.JULY || month == Month.AUGUST){
			return true;
		}else{
			return false;
		}
	}
}
