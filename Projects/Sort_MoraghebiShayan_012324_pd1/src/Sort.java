import java.util.Arrays;

public class Sort {
        public static void main(String[] args){
                int[] arr = {5,32,45,1,2343,54,0,11,21,234,7,9,8,11};
                System.out.println(Arrays.toString(arr));
                insertionSortB(arr);
                System.out.println(Arrays.toString(arr));
                selectionSortB(arr);
                System.out.println(Arrays.toString(arr));
        }
        public static void insertionSortB(int[] arr){
                int size = arr.length;
                for(int i = 1; i<size; i++){
                        int key = arr[i];
                        int j = i-1;
                        while(j>=0&&key>arr[i]){
                                arr[j+1]=arr[j];
                                j--;
                        }
                        arr[j+1]=key;
                }
        }
        public static void selectionSortB(int[] arr){
                int size = arr.length;
                for(int i = 0; i<size-1;i++){
                        int maxIndex = i;
                        for(int j = i+1; j<size; j++){
                                if(arr[j]>arr[maxIndex])
                                        maxIndex = j;
                        }
                        int temp = arr[i];
                        arr[i] = arr[maxIndex];
                        arr[maxIndex] = temp;
                }
        }
}
