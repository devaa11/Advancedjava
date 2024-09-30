public class BoundedTypeDemo{


//Comparable is predefined interface.
//CompareTo resides in Comparable interface


public static<E extends Comparable<E>> E Maxno(E a,E b){
	if(a.compareTo(b)>0){
		System.out.println("a is greater than b"+" "+ "a="+a);
		return a;
	}
	else{
		System.out.println("b is greater than a"+" "+ "b="+b);
		return b;
	}
}
public static void main(String args[]){
	Maxno(5,6);
	}
}