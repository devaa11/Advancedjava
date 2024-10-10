//wap to demonstrate Treeset
import java.util.*;
import java.util.TreeSet; 

import java.util.Collection;
public class TreeSetTest{
	public static void main(String args[]){
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(5);
		ts.add(15);
		ts.add(10);
		ts.add(30);

		System.out.println("Treeset elements: "+ts);
		 System.out.println("The first element is: " + ts.first());
		System.out.println("The last element is: " + ts.last());
		System.out.println("The headset element is: " + ts.headSet(15));		
		System.out.println("The tailset element is: " + ts.tailSet(15));
System.out.println("The lower element is: " + ts.lower(12));
System.out.println("The higher element is: " + ts.higher(13));
System.out.println("The floor element is: " + ts.floor(12));
System.out.println("The ceiling element is: " + ts.ceiling(13));
System.out.println("The pollFirst element is: " + ts.pollFirst());
System.out.println("The pollLast element is: " + ts.pollLast());
System.out.println("Treeset elements: "+ts);
		Set<String> hs=new HashSet<>();
		hs.add("Devendra");
		hs.add("Athrav");
		hs.add("Kartik");
		System.out.println("HashSet elements: "+hs);

		Set<Object> sh=new TreeSet<>(hs);
		System.out.println("Sorted HashSet elements: "+sh);

		
		//Set<Integer> ns=new NavigableSet<>();
		
	}
}