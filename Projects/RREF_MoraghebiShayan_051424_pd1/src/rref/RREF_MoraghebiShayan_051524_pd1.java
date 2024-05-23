package rref;

import java.util.Arrays;

public class RREF_MoraghebiShayan_051524_pd1 {

	public static void main(String[] args) {
		double[][] d1 = {{-1275,150,300,0,0,0,0,36},{150,-1500,825,150,0,0,0,36},{300,825,-1575,225,150,150,0,-54},{0,150,225,-1350,0,0,0,0},{0,0,150,0,-825,375,150,-27},{0,0,0,0,375,-2025,450,27},{0,0,0,0,150,450,-1425,45}};
		System.out.println(Arrays.deepToString(d1));
		System.out.println(Arrays.deepToString(rref(d1)));
		double i1 = d1[0][7];
		double i2 = d1[1][7];
		double i3 = d1[2][7];
		double i4 = d1[3][7];
		double i5 = d1[4][7];
		double i6 = d1[5][7];
		double i7 = d1[6][7];
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		System.out.println(i7);
		System.out.println(150*(i2-i1));
		System.out.println(150*(i5-i3));
		System.out.println(150*(-i1)+2*150*(-i3)+1.5*150*(-i3)+150*(i6-i3)+150*(i5-i3)+150*i5);
		System.out.println(2*18+2.5*150*(i3-i2)+1.5*150*(i3-i4)+150*(i3-i5)+1.5*(-18)+150*(i6-i5));
		System.out.println(-2*150*i3);
		System.out.println(150*(i7-i5));
		System.out.println(-150*i1-2*150*i3-1.5*150*i3-150*i6-1.5*150*i6-2*150*i6-2.5*150*i6-150*i7-1.5*150*i7-2*150*i7);
	}

	public static double[][] rref(double[][] matrix){
		int lead = 0;
		int i;

		int numRows = matrix.length;
		int numColumns = matrix[0].length;

		for(int k = 0; k < numRows; k++){
			if(numColumns <= lead){
				break;
			}
			i = k;
			while(matrix[i][lead] == 0){
				i++;
				if(numRows == i){
					i = k;
					lead++;
					if(numColumns == lead){
						break;
					}
				}

			}
			rowSwap(matrix, i, k);
			if(matrix[k][lead] != 0){
				rowScale(matrix, k, (1 / matrix[k][lead]));
			}
			for(i = 0; i < numRows; i++){
				if(i != k){
					rowAddScale(matrix, k, i, ((-1) * matrix[i][lead]));
				}
			}
			lead++;
		}

		return matrix;
	}

	private static void rowSwap(double[][] matrix, int rowIndex1, int rowIndex2){

		int numColumns = matrix[0].length;

		double hold;

		for(int k = 0; k < numColumns; k++){
			hold = matrix[rowIndex2][k];
			matrix[rowIndex2][k] = matrix[rowIndex1][k];
			matrix[rowIndex1][k] = hold;
		}

	}

	private static void rowScale(double[][] matrix, int rowIndex, double scalar){

		int numColumns = matrix[0].length;

		for(int k = 0; k < numColumns; k++){
			matrix[rowIndex][k] *= scalar;
		}

	}

	private static void rowAddScale(double[][] matrix, int rowIndex1, int rowIndex2, double scalar){

		int numColumns = matrix[0].length;

		for(int k = 0; k < numColumns; k++){
			matrix[rowIndex2][k] += (matrix[rowIndex1][k] * scalar);
		}

	}

}