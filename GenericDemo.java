//WAP to demonstrate generic type method
import java.util.*;
public class GenericDemo{




public static  void main(String args[]){
	Integer a[]={1,2,3,4,5,6};
	int arr[]={1,2,3,4,5,6};//primitive type
	Double darr[]={1.5,2.6,3.5,4.5,5.8,6.4};//
	String sarr[]={ "Devv" ,"Athrav","Harsh","Pratham"};
//print(arr);
print(a);
print(darr);
print(sarr);
	}

//public static void print(Integer[] list)
//public static void print(Integer[] list)
public static<E> void print(E[] list)

{
	for(int i=0;i<list.length;i++){
		System.out.println(list[i] + " ");
	}
}
}