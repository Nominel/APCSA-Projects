package q4;

import java.util.List;
import java.util.ArrayList;

public class MatrixUtilities
{
	public static Position findPosition( int num, int[][] intArr )
	{
		for (int r = 0; r < intArr.length; r++) {
			for (int c = 0; c < intArr[0].length; c++) {
				if(intArr[r][c]==num)
					return new Position(r,c);
			}
		}
		return null;
	}
	
	public static Position[][] getSuccessorArray( int[][] intArr )
	{
		Position[][] arr = new Position[intArr.length][intArr[0].length];
		for (int r = 0; r < intArr.length; r++) {
			for (int c = 0; c < intArr[0].length; c++) {
				arr[r][c]=findPosition(intArr[r][c]+1,intArr);
			}
		}
		return arr;
	}

}