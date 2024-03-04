public class Cat extends Animal{
	private int age;

	public Cat() {
	}

	public Cat(String n) {
		super(n);
	}

	public Cat(String n, int a) {
		this(n);
		age = a;
	}

	@Override
	public void sound() {
		System.out.println("meowww!!");
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass())
			return false;
		Cat other = (Cat) o;
		return age == other.age && super.getName().equals(other.getName());
	}

	@Override
	public String toString() {
		return "Cat with name "+super.getName()+" of age "+age;
	}
}
