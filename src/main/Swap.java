package main;

public class Swap {

	public static void main(String args[]) {
		Animal a1 = new Animal("Lion");
		Animal a2 = new Animal("Crocodile");

		System.out.println("Before Swap:- a1:" + a1 + "; a2:" + a2);
		swap(a1, a2);
		
		
		System.out.println("After Swap:- a1:" + a1 + "; a2:" + a2);
		
//		put( "platypus", a1 );
//		
//		System.out.println( a1.toString() );
		
	}

//	public static void put( final String name, final Animal obj ) {
//		obj.name = name;
//	}
	
	public static void swap(Animal animal1, Animal animal2) {
		Animal temp = new Animal("");
		System.out.println(temp.toString());
		System.out.println("--------------------------------------------------");
		
		temp = animal1;
		System.out.println(temp.toString());
		System.out.println("--------------------------------------------------");
		
		animal1 = animal2;
		System.out.println(animal1.toString());
		System.out.println("--------------------------------------------------");
		
		
		animal2 = temp;
		System.out.println(animal1.toString());
		System.out.println("--------------------------------------------------");
		System.out.println("Finally---->");
		System.out.println("animal 1 is now: "+animal1.toString());
		System.out.println("animal 2 is now: "+animal2.toString());
		animal1.name="test1";
		animal2.name="test2";
		System.out.println("--------------------------------------------------");
		System.out.println("Finally, finally---->");
		System.out.println("animal 1 is now: "+animal1.toString());
		System.out.println("animal 2 is now: "+animal2.toString());
	}

}

class Animal {
	public String name;

	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}
