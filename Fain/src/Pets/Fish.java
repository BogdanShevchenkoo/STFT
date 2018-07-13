package Pets;

public class Fish implements Swimmable,Talkable{
	String name;
	Fish(String name){
		this.name = name;
	}
	
	public void swim(int howFar){
		System.out.println("I'll swim " + howFar + " meters");
	}
	
	public void dive(int howDeep){
		System.out.println("I'm " + name + ",dive to the depths " + howDeep);
	}
	
	public void talk(){
		
	}
	
}
