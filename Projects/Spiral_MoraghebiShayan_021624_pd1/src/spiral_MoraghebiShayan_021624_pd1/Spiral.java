package spiral_MoraghebiShayan_021624_pd1;

public class Spiral {
        private int[][] matrix;

        public Spiral(){
                this(3,0);
        }
        public Spiral(int size){
                this(size,0);
        }
        public Spiral (int size, int start){
                matrix = new int[size][size];
                int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

                int dir = 1;

                while (top <= bottom && left <= right) {

                        if (dir == 1) {
                                for (int i = left; i <= right; ++i) {
                                        matrix[top][i] = start;
                                        start++;
                                }
                                ++top;
                                dir = 2;
                        }
                        else if (dir == 2) {
                                for (int i = top; i <= bottom; ++i) {
                                        matrix[i][right] = start;
                                        start++;
                                }
                                --right;
                                dir = 3;
                        }
                        else if (dir == 3) {
                                for (int i = right; i >= left; --i) {
                                        matrix[bottom][i] = start;
                                        start++;
                                }
                                --bottom;
                                dir = 4;
                        }
                        else if (dir == 4) {
                                for (int i = bottom; i >= top; --i) {
                                        matrix[i][left] = start;
                                        start++;
                                }
                                ++left;
                                dir = 1;
                        }
                }
        }
        @Override
        public String toString(){
                String output = "";
                for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[0].length; j++) {
                                output+=matrix[i][j]+"\t";
                        }
                        output+="\n";
                }
                return output;
        }
}
