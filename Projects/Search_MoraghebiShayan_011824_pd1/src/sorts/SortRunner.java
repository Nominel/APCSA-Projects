package sorts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortRunner {
        public static void main(String[] args) throws FileNotFoundException {
                File file = new File("data\\sample01.txt");
                Scanner data = new Scanner(file);
                ArrayList<String> insertion = new ArrayList<>();
                while (data.hasNextLine())
                        insertion.add(data.nextLine());
                System.out.println(insertion);
                ArrayList<String> selection = new ArrayList<>(insertion);
                ArrayList<String> bubble = new ArrayList<>(insertion);
                Sort102 sort = new Sort102();
                sort.insertionStr(insertion);
                sort.selectionStr(selection);
                sort.bubbleStr(bubble);
                System.out.println(insertion);
                System.out.println(selection);
                System.out.println(bubble);
        }
}
