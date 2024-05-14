package rref;

import java.util.Arrays;

public class RREF {

	public static void main(String[] args) {
		double[][] d1 = {{3,2,-1,10},{4,-3,4,-14},{5,1,2,1}};
		System.out.println(Arrays.deepToString(rref(d1)));
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