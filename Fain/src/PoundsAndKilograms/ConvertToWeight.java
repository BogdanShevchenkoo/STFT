package PoundsAndKilograms;

public class ConvertToWeight {
	
	static void ConvertWeigth(float weight, char c){
		if(c=='p'){
			weight = weight / 2.204f;
			System.out.printf("This weight in kilogram %.3f \n", weight);
		}
		if(c=='k'){
			weight = weight * 2.204f;
			System.out.printf("This weight in pounds %.3f \n", weight);
		}
	}

	public static void main(String[] args) {
		ConvertWeigth(3.6f,'p');
		ConvertWeigth(2.8f,'p');
	}

}
