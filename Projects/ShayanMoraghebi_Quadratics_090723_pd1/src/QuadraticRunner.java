import java.util.Scanner;

public class QuadraticRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :: ");
        int a = sc.nextInt();
        System.out.print("Enter b :: ");
        int b = sc.nextInt();
        System.out.print("Enter c :: ");
        int c = sc.nextInt();
        Quadratic quad = new Quadratic(a,b,c);
        double[] ans = quad.solve();
        System.out.println("rootone :: "+String.format("%.2f",ans[0])+
        "\nroottwo :: "+String.format("%.2f",ans[1]));
    }
}