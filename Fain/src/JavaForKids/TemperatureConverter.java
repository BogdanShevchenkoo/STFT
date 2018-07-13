package JavaForKids;

public class TemperatureConverter {

	public static void convertTemp(float temperature, char convertTo){
		float f = (9*temperature/5 + 32);
		float c = (temperature - 32) * 5/9;
		if(f % 1 == 0 && convertTo == 'f' || convertTo == 'F' && f % 1 == 0){
			System.out.format("The temperature in Fahrenheit is " + "%.0f %n", + (9*temperature/5 + 32));
		}
		else if(c % 1 == 0 && convertTo == 'C' || convertTo == 'c' && c % 1 == 0){
			System.out.format("The temperature in Celsius is " + "%.0f %n",  + ((temperature - 32) * 5/9));
		}
		else if(convertTo == 'f' || convertTo == 'F'){
			System.out.format("The temperature in Fahrenheit is " + "%.2f %n", + (9*temperature/5 + 32));
		}
		else if(convertTo == 'C' || convertTo == 'c'){
			System.out.format("The temperature in Celsius is " + "%.2f %n",  + ((temperature - 32) * 5/9));
		}
		else{
	        System.out.println("You can enter either F or C as convertTo argument");  
		}
	}
	
	public static void main(String[] args) {
		
		convertTemp(14,'F');
		convertTemp(107.6f,'c');
		convertTemp(20,'F');
		convertTemp(1,'f');

	}

}
