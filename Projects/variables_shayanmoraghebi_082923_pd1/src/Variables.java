public class Variables
{
   public static void main ( String[] args )
   {
	//define 1 variable of each of the
	//following data types
	//byte	short		int 		long
	//float	double
	//char      boolean	String

	//integer variables
	byte byteOne = 127;
    short shortOne = -32123;
    int intOne = 90877;
    long longOne = 999999999;

    //real variables
    float floatOne = 38.567_8F;
    double doubleOne = 923.234;

    //other integers
    char charOne = 'A';

    //other variables
    boolean booleanOne = true;
    String stringOne = "hello world";

    System.out.println("/////////////////////////////////");
	System.out.println("*Some Person           2022-0823*");
	System.out.println("""
			*                               *
			*        integer types          *
			*                               *""");
	System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
    System.out.println("*16 bit - shortOne = "+shortOne+"\t*");
    System.out.println("*32 bit - intOne = "+intOne+"\t*");
    System.out.println("*64 bit - longOne = "+longOne+"\t*");
    System.out.println("""
            *                               *
            *         real types            *
            *                               *""");
    System.out.println("*32 bit - floatOne = "+floatOne+"\t*");
    System.out.println("*64 bit - doubleOne = "+doubleOne+"\t*");
    System.out.println("""
            *                               *
            *      other integer types      *
            *                               *""");
    System.out.println("*16 bit - charOne = "+charOne+"\t\t*");
    System.out.println("""
            *                               *
            *         other types           *
            *                               *""");
    System.out.println("*booleanOne = "+booleanOne+"\t\t*");
    System.out.println("*stringOne = "+stringOne+"\t*");
    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
   }
}

