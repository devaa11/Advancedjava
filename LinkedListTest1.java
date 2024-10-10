//wap to traverse a linked list in backward  and forward direction using list itreator


import java.util.*;
public class LinkedListTest1 {
public static void main(String args[]){
LinkedList<String> list=new LinkedList<>();
list.add("Green");
list.add("Bluee");
list.add("Yellow");
list.add("Red");

ListIterator<String> it=list.listIterator();
System.out.println("Using Next Method");
while(it.hasNext())
System.out.println(it.next());

System.out.println("");
System.out.println("Using Previous Method");
//if you want to directly tarvel using previous method
//it=list.listItreator(list.size());
while(it.hasPrevious())
System.out.println(it.previous());

System.out.println("");
System.out.println("Using for Method");
for(int i=list.size()-1;i>=0;i--){
System.out.println(list.get(i));
}

list.set(0,"Devendra");
System.out.println(list);
}
}