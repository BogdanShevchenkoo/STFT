package Pets;

interface Swimmable {
	
	final static int MAX_DEPTH = 10;
	
	public void swim(int howFar);
	
	public default void dive(int howDeep){
		if(howDeep > MAX_DEPTH){
			System.out.println("I can't dive into " + MAX_DEPTH + " meters");
		}
	}
	
}
