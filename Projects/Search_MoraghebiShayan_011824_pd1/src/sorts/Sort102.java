package sorts;

import java.util.ArrayList;

public class Sort102 {
        public void insertionStr(ArrayList<String> arr){
                int n = arr.size();
                for (int i = 1; i < n; ++i) {
                        String key = arr.get(i);
                        int j = i - 1;
                        while (j >= 0 && arr.get(j).compareTo(key) > 0) {
                                arr.set(j + 1, arr.get(j));
                                j = j - 1;
                        }
                        arr.set(j + 1, key);
                }
        }

        public void selectionStr(ArrayList<String> arr){
                int n = arr.size();
                for (int i = 0; i < n-1; i++)
                {
                        int min_idx = i;
                        for (int j = i+1; j < n; j++)
                                if (arr.get(j).compareTo(arr.get(min_idx))<0)
                                        min_idx = j;
                        String temp = arr.get(min_idx);
                        arr.set(min_idx, arr.get(i));
                        arr.set(i, temp);
                }
        }

        public void bubbleStr(ArrayList<String> arr){
                int n = arr.size();
                for (int i = 0; i < n - 1; i++)
                        for (int j = 0; j < n - i - 1; j++)
                                if (arr.get(j).compareTo(arr.get(j + 1)) >0 ) {
                                        // swap temp and arr[i]
                                        String temp = arr.get(j);
                                        arr.set(j, arr.get(j + 1));
                                        arr.set(j + 1, temp);
                                }
        }
}
