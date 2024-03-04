public class Chihuahua extends Dog{
	private int height;
	private int weight;

	public Chihuahua(){
	}
	public Chihuahua(String n){
		super(n);
	}
	public Chihuahua(String n, int a){
		super(n,a);
	}
	public Chihuahua(String n, int a, int w){
		this(n,a);
		weight=w;
	}
	public Chihuahua(String n, int a, int w, int h){
		this(n,a);
		weight=w;
		height = h;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass())
			return false;
		Chihuahua other = (Chihuahua) o;
		return super.getAge() == other.getAge() && super.getName().equals(other.getName())&&height==other.getHeight()&&weight== other.getWeight();
	}

	@Override
	public void sound() {
		System.out.println("woof, woof");
	}

	@Override
	public String toString() {
		return "Chihuahua with name "+super.getName()+" of age "+super.getAge()+" of height "+height+" inches and weight "+weight+" pounds";
	}
}
