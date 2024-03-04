public class Animal {
	private String name;

	public Animal(){
	}
	public Animal(String n){
		name=n;
	}

	public void sound(){
		System.out.println("Sound");
	}

	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "Animal with name " + name;
	}
}
