//wap to demonstrate Treeset
import java.util.*;
import java.util.TreeSet; 

import java.util.Collection;
public class maptest{
	public static void main(String args[]){

//hashmap kase pn yettte
		Map<String,Integer> hm=new HashMap<>();
		hm.put("Devendra",66);
		hm.put("Atharv",55);
		hm.put("Kartik",33);
		hm.put("Harsh",22);
	

		System.out.println("Hashmap elements: "+hm);
		
//LinkedHashMap madhe jase value put karnar tasa yenarr
		Map<String,Integer> lm=new LinkedHashMap<>();
		lm.put("Devendra",66);
		lm.put("Atharv",55);
		lm.put("Kartik",33);
		lm.put("Harsh",22);
	

		System.out.println("LinkedHashmap elements: "+lm);
		
//TreeMap madhe key based sorting honar
		Map<String,Integer> tm=new TreeMap<>();
		tm.put("Devendra",66);
		tm.put("Atharv",55);
		tm.put("Kartik",33);
		tm.put("Harsh",22);
		

		System.out.println("TreeHashmap elements: "+tm);
		
	}
}