package q4;

import java.util.List;
import java.util.ArrayList;

public class MatrixUtilitiesRunner 
{
    public static void main(String[] args) 
    {
		MatrixUtilities fun = new MatrixUtilities();
			
		int[][] arr = {{20,2,10,11},{21,9,12,15},{16,17,13,18}};
		
		System.out.println( fun.findPosition( 17, arr) );
		
		System.out.println( fun.findPosition( 5, arr) );
		
		System.out.println( fun.findPosition( 13, arr) );
		
		Position[][] aplus = fun.getSuccessorArray( arr );
		
		for( Position[] row : aplus )
		{
			for( Position item : row )
			{
				System.out.print( item + " " );
			}
			System.out.println();
		}			
    }
}

/*
OUTPUT

(2,1)
null
(2,2)

(1,0) null (0,3) (1,2)
null (0,2) (2,2) (2,0)
(2,1) (2,3) null null


*/