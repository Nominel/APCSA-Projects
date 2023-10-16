public class MinMax {
    public double caclculateY(double x){
        return (1./3)*Math.pow(x,3)-(1./2)*Math.pow(x,2)+2;
    }
    public double caclculateG(double x){
        return Math.pow(x,2)-x;
    }
}
