/**
 * The MinMax class is a utility class that calculates the values of function
 * Y(x) and G(x) for a given range of x values.
 */
public class MinMax {
    public static void main(String[] args){
        double x=-1.01;
        System.out.println("  x        y        g  ");
        while(x<=2){
            x+=0.01;
            System.out.printf("%5.2f   %6.4f   %6.4f\n",x, calculateY(x), calculateG(x));
        }
    }
    public static double calculateY(double x){
        return (1./3)*Math.pow(x,3)-(1./2)*Math.pow(x,2)+2;
    }
    public static double calculateG(double x){
        return Math.pow(x,2)-x;
    }
}
