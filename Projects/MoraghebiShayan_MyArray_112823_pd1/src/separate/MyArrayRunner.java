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
        System.out.println(MyArray.withE(new String[] {"cvhs", "rhino", "hello"}));
        System.out.println(MyArray.withE(new String[] {"err", "accept", "new"}));
        System.out.println(MyArray.withE(new String[] {"one"}));
        System.out.println(MyArray.withE(new String[] {"two"}));
        System.out.println(Arrays.toString(MyArray.quadF(new int[] {2, -5, 1})));
        System.out.println(Arrays.toString(MyArray.quadF(new int[] {1, -2, 3})));
        System.out.println(Arrays.toString(MyArray.quadF(new int[] {2, 5, 6})));
        System.out.println(Arrays.toString(MyArray.notInArray1(new int[] {1,2,3,4,5,6,7,8,9},new int[] {3,12,-9,5,0})));
        System.out.println(Arrays.toString(MyArray.notInArray1(new int[] {6,7,8,9},new int[] {30})));
        System.out.println(Arrays.toString(MyArray.notInArray1(new int[] {1,2,3,4},new int[] {1,2,3,4})));
    }
}
