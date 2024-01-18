package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data\\sample01.txt");
        Scanner data = new Scanner(file);
        ArrayList<String> s = new ArrayList<>();
        while(data.hasNextLine())
            s.add(data.nextLine());
        ArrayList<String> a = new ArrayList<>(s);
        a.sort(null);
        System.out.println("the index of Melanogaster using linear search is "+linearSearch(s,"Melanogaster"));
        System.out.println("the index of Melanogaster using binary search is "+binarySearch(a,"Melanogaster"));
        System.out.println("the index of Methane using linear search is "+linearSearch(s,"Methane"));
        System.out.println("the index of Methane using binary search is "+binarySearch(a,"Methane"));

    }
    static int linearSearch(ArrayList<String> s, String target){
        for(int i = 0; i<s.size();i++)
            if(s.get(i).equals(target))
                return i;
        return -1;
    }
    static int binarySearch(ArrayList<String> a, String target){
        int lowerIndex = 0, upperIndex = a.size()-1;
        while(lowerIndex<=upperIndex){
            int middleIndex = lowerIndex + (upperIndex-lowerIndex)/2;
            if(a.get(middleIndex).equals(target))
                return middleIndex;
            if(target.compareTo(a.get(middleIndex))>0)
                lowerIndex=middleIndex+1;
            else
                upperIndex=middleIndex-1;
        }
        return -1;
    }
}
