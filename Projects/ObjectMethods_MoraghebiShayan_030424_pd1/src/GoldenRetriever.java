public class GoldenRetriever extends Dog{
	private int height;
	private int weight;

	public GoldenRetriever(){
	}
	public GoldenRetriever(String n){
		super(n);
	}
	public GoldenRetriever(String n, int a){
		super(n,a);
	}
	public GoldenRetriever(String n, int a, int w){
		this(n,a);
		weight=w;
	}
	public GoldenRetriever(String n, int a, int w, int h){
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
		GoldenRetriever other = (GoldenRetriever) o;
		return super.getAge() == other.getAge() && super.getName().equals(other.getName())&&height==other.getHeight()&&weight== other.getWeight();
	}

	@Override
	public void sound() {
		System.out.println("WOOFFF, WOFF!!");
	}

	@Override
	public String toString() {
		return "Golden Retriever with name "+super.getName()+" of age "+super.getAge()+" of height "+height+" inches and weight "+weight+" pounds";
	}
}
