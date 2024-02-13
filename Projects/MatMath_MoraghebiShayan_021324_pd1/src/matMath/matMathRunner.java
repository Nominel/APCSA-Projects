package matMath;


import java.util.Arrays;

public class matMathRunner {
        public static void main(String[] args){
                int[][] m1 = {{1,2,-1},{2,-2,0},{1,-1,2}};
                int[][] m2 = {{1,2},{1,-1},{2,1}};
                int[][] m4 = {{1,-2,1},{1,0,1},{2,-1,1}};
                int[][] m7 = {{1,2,-1},{2,-2,3}};
                MatMath mat = new MatMath();
                System.out.println(Arrays.deepToString(mat.multiply(m2, m1)));
                System.out.println(Arrays.deepToString(mat.multiply(m1, m2)));
                System.out.println(Arrays.deepToString(mat.multiply(m7, m4)));
                System.out.println(Arrays.deepToString(mat.add(m7, m1)));
                System.out.println(Arrays.deepToString(mat.add(m4, m1)));
                System.out.println(mat.determinant(m2));
                System.out.println(mat.determinant(m4));
        }
}
