
import java.util.*;
public class LinkedListTest{
public static void main(String args[]){
LinkedList<String> list=new LinkedList<>();
list.add("Green");
list.add("Bluee");
list.add("Yellow");
list.add("Red");
System.out.println(list);
list.addFirst("Pink");
System.out.println(list);

list.addLast("Purple");
list.add("Brown");
System.out.println(list);

System.out.println("First Element :"+list.getFirst());
System.out.println("Last Element :"+list.getLast());
System.out.println("Removed First Element:"+list.removeFirst());
System.out.println("Removed Last Element:"+list.removeLast());
System.out.println(list);


List<Integer> list1=new LinkedList<>();
list1.add(1);
list1.add(2);

List<Object> list2=new LinkedList<>(list1);
System.out.println(list2);
//Display indexOf yellow
System.out.println(list.indexOf("Yellow"));
}
}