package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {

	 public static void main(String a[]){
         
	        List<String> myList = new ArrayList<String>();
	        myList.add("Java");
	        myList.add("Unix");
	        myList.add("Oracle");
	        myList.add("C++");
	        myList.add("Perl");
	        System.out.println(myList);
	        System.out.println(myList.size());
	        Iterator<String> itr = myList.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	            itr.remove();
	        }
	        
	        System.out.println(myList);
	 }
	 }
