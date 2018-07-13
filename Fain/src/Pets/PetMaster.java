package Pets;

public class PetMaster {

	public static void main(String[] args) {
		
		Dog myDog = new Dog("Arnold");
        myDog.talk();
        myDog.swim(7);
        myDog.dive(2);  // will use default method

        Fish myFish = new Fish("Goldfish");
        myFish.swim(50);
        myFish.dive(20);
        myFish.talk();

	}

}
