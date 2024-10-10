
import java.util.*;

public class Itreatortest{
	public static void main(String args[]){
		List<Integer> list=new LinkedList<>();
		list.add(5);
		list.add(4);
		list.add(10);
		list.add(20);
		
		System.out.println("Traversing elements with for loop");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
			
		}
		System.out.println("Traversing elements with forEach loop");
		for(Integer a: list){
			System.out.println(a);
		}
		System.out.println("Traversing elements with Iterator");
		Iterator<Integer> it=list.iterator();
		
		while(it.hasNext())	
		System.out.println(it.next());
		//while(it.hasPrevious())	
		System.out.println(it.previous());


		//System.out.println(it.hasNext());
	}
}