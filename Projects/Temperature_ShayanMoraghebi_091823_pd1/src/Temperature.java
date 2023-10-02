import java.util.Scanner;

import static java.lang.System.exit;

public class Temperature {
    public static void main(String[] args){
        //Variables, Wrapper types used as required by assignment
        Scanner scan = new Scanner(System.in);
        Integer inputScale;
        Double inputVal;
        Double outputVal;

        //Getting inputs
        System.out.print("Enter the temperature you want to be converted: ");
        inputVal = Double.parseDouble(scan.next());
        System.out.println();
        System.out.print("Enter the temperature scale of the input as a number (Celsius (1), Kelvin (2), Fahrenheit (3), or Rankine (4): ");
        inputScale = Integer.parseInt(scan.next());
        System.out.println();

        //checking if scale is within range
        if(!(inputScale==1||inputScale==2||inputScale==3||inputScale==4)){
            System.out.println("Input temp scale not recognized");
            exit(0);
        }

        //Getting ans while skipping steps if in and out is the same
        switch(inputScale){
            case 1 -> {
                outputVal = convert(inputVal, inputScale, 2);
                System.out.println("The temperature in Kelvin is: " + outputVal);
                outputVal = convert(inputVal, inputScale, 3);
                System.out.println("The temperature in Fahrenheit is: " + outputVal);
                outputVal = convert(inputVal, inputScale, 4);
                System.out.println("The temperature in Rankine is: " + outputVal);
            }
            case 2 -> {
                outputVal = convert(inputVal, inputScale, 1);
                System.out.println("The temperature in Celsius is: " + outputVal);
                outputVal = convert(inputVal, inputScale, 3);
                System.out.println("The temperature in Fahrenheit is: " + outputVal);
                outputVal = convert(inputVal, inputScale, 4);
                System.out.println("The temperature in Rankine is: " + outputVal);
            }
            case 3 -> {
                outputVal = convert(inputVal, inputScale, 1);
                System.out.println("The temperature in Celsius is: " + outputVal);
                outputVal = convert(inputVal, inputScale, 2);
                System.out.println("The temperature in Kelvin is: " + outputVal);
                outputVal = convert(inputVal, inputScale, 4);
                System.out.println("The temperature in Rankine is: " + outputVal);
            }
            case 4 -> {
                outputVal = convert(inputVal, inputScale, 1);
                System.out.println("The temperature in Celsius is: " + outputVal);
                outputVal = convert(inputVal, inputScale, 2);
                System.out.println("The temperature in Kelvin is: " + outputVal);
                outputVal = convert(inputVal, inputScale, 3);
                System.out.println("The temperature in Fahrenheit is: " + outputVal);
            }
        }

    }
    public static double convert(double val, int in, int out){
        double ans = 0;
        //big nested switch to quickly get ans, same in and out already filtered by previous code along with invalid ins and outs
        switch (in) {
            case 1 -> {
                switch (out) {
                    case 2 -> ans = val + 273.15;
                    case 3 -> ans = ((9 * val) / 5 + 32);
                    case 4 -> ans = ((val + 273.15) * 9) / 5;
                }
            }
            case 2 -> {
                switch (out) {
                    case 1 -> ans = val-273.15;
                    case 3 -> ans = (val*9/5-459.67);
                    case 4 -> ans = (val* 9) / 5;
                }
            }
            case 3 -> {
                switch (out) {
                    case 1 -> ans = (val-32)*5/9;
                    case 2 -> ans = (val + 459.67)*5/9;
                    case 4 -> ans = val + 459.67;
                }
            }
            case 4 -> {
                switch (out) {
                    case 1 -> ans = (val-491.67)*5/9;
                    case 2 -> ans = val*5/9;
                    case 3 -> ans = val - 459.67;
                }
            }
        }
        return ans;
    }
}
