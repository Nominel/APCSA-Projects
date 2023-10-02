public class Quadratic {
    private final double a;
    private final double b;
    private final double c;

    public Quadratic(double first,double second,double third){
        a=first;
        b=second;
        c=third;
    }
    public double[] solve(){
        double[] root = new double[2];
        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);
        root[0]=((-b+sqrt)/(2*a));
        root[1]=((-b-sqrt)/(2*a));
        return root;
    }
}
