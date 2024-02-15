package q2;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MultPracticeRunner
{
    public static void main(String[] args)
    {
			StudyPractice p1 = new MultPractice( 13, 5 );
			System.out.println( p1.getProblem() );

			p1.nextProblem();
			System.out.println( p1.getProblem() );

			p1.nextProblem();
			System.out.println( p1.getProblem() );

			p1.nextProblem();
			System.out.println( p1.getProblem() );

			p1.nextProblem();
			System.out.println( p1.getProblem() );

			p1.nextProblem();
			System.out.println( p1.getProblem() );

			StudyPractice p2 = new MultPractice( 9, 1 );

			p2.nextProblem();
			System.out.println( p2.getProblem() );
			System.out.println( p2.getProblem() );

			p2.nextProblem();
			p2.nextProblem();
			System.out.println( p2.getProblem() );

			p2.nextProblem();
			System.out.println( p2.getProblem() );

			p2.nextProblem();
			System.out.println( p2.getProblem() );

    }
}


/*OUTPUT

13 TIMES 5
13 TIMES 6
13 TIMES 7
13 TIMES 8
13 TIMES 9
13 TIMES 10
9 TIMES 2
9 TIMES 2
9 TIMES 4
9 TIMES 5
9 TIMES 6

*/
