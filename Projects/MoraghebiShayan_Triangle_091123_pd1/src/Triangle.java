public class Triangle {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private double perimeter;

    public Triangle(double a,double b, double c){
        sideA=a;
        sideB=b;
        sideC=c;
    }
    public void calculatePerimeter(){
        perimeter=(sideA+sideB+sideC);
    }
    public double getArea(){
        perimeter=(sideA+sideB+sideC);
        double s = perimeter/2;
        double sa = (s-sideA);
        double sb = (s-sideB);
        double sc = (s-sideC);
        double root= (s*sa*sb*sc);
        return Math.sqrt(root);
    }
}
