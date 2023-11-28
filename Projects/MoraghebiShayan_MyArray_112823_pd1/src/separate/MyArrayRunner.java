package separate;

import java.util.Arrays;

public class MyArrayRunner {
    public static void main(String[] args){
        System.out.println(Arrays.toString(MyArray.separate(new int[] {1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(MyArray.separate(new int[] {7,3,4,1,5,2})));
        System.out.println(Arrays.toString(MyArray.separate(new int[] {11, 12, 20, 8, 4, 1})));
        System.out.println(Arrays.toString(MyArray.separate(new int[] {4})));
        System.out.println(MyArray.average(new double[] {1.5, -3.5, 8, 7, 0}));
        System.out.println(MyArray.average(new double[] {-5, -7.5}));
        System.out.println(MyArray.average(new double[] {0.25, 0, 7.5, 4.13, 2.15, 0.03, 3, -6 }));
    }
}
