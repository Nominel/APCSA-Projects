package q1;

import java.util.List;
import java.util.ArrayList;

public class Digits
{
   private ArrayList<Integer> digitList;
   
   //part A
   public Digits( int num ) {
           digitList=new ArrayList<>();
           String str = Integer.toString(num);
           for(int i = 0; i<str.length();i++)
                   digitList.add(str.charAt(i)-'0');
   }
   
	//part B
        public boolean isStrictlyIncreasing() {
                for (int i = 1; i < digitList.size(); i++) {
                        if(!(digitList.get(i-1)<digitList.get(i)))
                                return false;
                }
		return true;
	}  
      
   public String toString() {
		return "" + digitList;
   }
}