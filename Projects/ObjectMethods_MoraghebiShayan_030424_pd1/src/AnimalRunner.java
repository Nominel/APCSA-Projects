public class AnimalRunner {
	public static void main(String[] args){
		Animal animal1 = new Animal();
		animal1.sound();
		Animal animal2 = new Chihuahua();
		animal2.sound();
		Animal animal3 = (Dog) animal2;
		animal3.sound();

		Animal dog1 = new Dog("Bingo", 12);
		Animal dog2 = new Dog("Bingo", 12);
		Animal dog3 = new Dog("Bozo", 8);
		Animal cat1 = new Cat("Bozo", 8);
		System.out.println(dog1.equals(dog2));
		System.out.println(dog3.equals(cat1));

		Animal retriever1 = new GoldenRetriever("John", 3, 12, 15);
		Animal retriever2 = new GoldenRetriever("John", 3, 12, 15);
		Animal retriever3 = new GoldenRetriever("Pinky", 11, 13, 20);
		Animal chihuahua1 = new Chihuahua("Pinky", 11, 13, 20);
		System.out.println(retriever1.equals(retriever2));
		System.out.println(retriever3.equals(chihuahua1));
	}
}
