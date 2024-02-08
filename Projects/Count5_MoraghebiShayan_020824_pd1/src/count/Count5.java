package count;

public class Count5 {
        public void count5(int[][] arr){
                int replace = arr[0][0];
                int index = 0;
                for(int r = 0; r< arr.length; r++){
                        if(r%2==0){
                                for(int c = 0; c<arr[r].length; c++){
                                        index++;
                                        if(index==5){
                                                if(replace>arr[r][c]) {
                                                        int temp = arr[r][c];
                                                        arr[r][c] = replace;
                                                        replace = temp;
                                                }
                                                index=0;
                                        }
                                }
                        }
                        else{
                                for(int c = arr[r].length-1; c>=0;c--){
                                        index++;
                                        if(index==5){
                                                if(replace>arr[r][c]) {
                                                        int temp = arr[r][c];
                                                        arr[r][c] = replace;
                                                        replace = temp;
                                                }
                                                index=0;
                                        }
                                }
                        }
                }
        }
}
