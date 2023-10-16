public class MinMaxRunner {
    public static void main(String[] args){
        MinMax minMax = new MinMax();
        double x=-1.01;
        System.out.println("  x        y        g  ");
        while(x<=2){
            x+=0.01;
            System.out.printf("%5.2f   %6.4f   %6.4f\n",x, minMax.caclculateY(x),minMax.caclculateG(x));
        }
    }
}
