import java.util.Objects;

public class Dog extends Animal {
	private int age;

	public Dog() {
	}

	public Dog(String n) {
		super(n);
	}

	public Dog(String n, int a) {
		this(n);
		age = a;
	}

	public int getAge() {
		return age;
	}

	@Override
	public void sound() {
		System.out.println("wwooofff!! woff!");
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass())
			return false;
		Dog other = (Dog) o;
		return age == other.age && super.getName().equals(other.getName());
	}

	@Override
	public String toString() {
		return "Dog with name "+super.getName()+" of age "+age;
	}
}