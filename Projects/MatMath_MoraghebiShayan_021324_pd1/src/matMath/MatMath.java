package matMath;

public class MatMath {
        public int[][] multiply(int[][] mat1, int[][] mat2){
                if(mat1[0].length!= mat2.length)
                        return null;
                int[][] finalMat = new int[mat1.length][mat2[0].length];
                for(int col = 0; col<mat2[0].length; col++){
                        for(int row = 0; row<mat1.length; row++) {
                                int sum = 0;
                                for(int i = 0; i<mat2.length;i++){
                                        sum+= (mat1[row][i]*mat2[i][col]);
                                }
                                finalMat[row][col]=sum;
                        }
                }
                return finalMat;
        }

        public int[][] add(int[][] mat1, int[][] mat2){
                if(mat1.length!= mat2.length||mat1[0].length!=mat2[0].length)
                        return null;
                int[][] finalMat = new int[mat1.length][mat1[0].length];
                for(int col = 0; col<mat2[0].length; col++){
                        for(int row = 0; row<mat1.length; row++){
                                finalMat[row][col] =  mat1[row][col]+mat2[row][col];
                        }
                }
                return finalMat;
        }

        public Double determinant(int[][] mat){
                if(mat.length!=mat[0].length){
                        System.out.println("Dimension error; must be square!");
                        return null;
                }
                if(mat.length==1)
                        return (double) mat[0][0];
                if(mat.length==2)
                        return (double)(mat[0][0]*mat[1][1]+mat[1][0]*mat[0][1]);
                if(mat.length == 3)
                        return (double) (mat[0][0] * (mat[1][1] * mat[2][2] - mat[2][1] * mat[1][2]) - mat[0][1] * (mat[1][0] * mat[2][2] - mat[2][0] * mat[1][2]) + mat[0][2] * (mat[1][0] * mat[2][1] - mat[2][0] * mat[1][1]));
                System.out.println("Nah");
                return null;
        }
}
