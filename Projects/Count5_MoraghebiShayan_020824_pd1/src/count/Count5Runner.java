package count;

import java.util.Arrays;

public class Count5Runner {
        public static void main(String[] args){
                int[][] r = {{7,3,4,6},
                        {2,3,0,4},
                        {6,8,1,2},
                        {4,5,9,1},
                        {2,4,8,3},
                        {4,5,7,1}
                };
                System.out.println(Arrays.deepToString(r));
                Count5 count5 = new Count5();
                count5.count5(r);
                System.out.println(Arrays.deepToString(r));
        }
}
