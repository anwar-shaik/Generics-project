package com.generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Container<Integer,String> container = new Container<>(12, "hello");
		int val1 = container.getItem1();
		String val2 = container.getItem2();
		
		Set<String> mySet1 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("whatever");
		
		Set<String> mySet2 = new HashSet<String>();
		mySet1.add("first");
		mySet1.add("second");
		mySet1.add("computer");
		
		Set<String> resultSet = union(mySet1,mySet2);
		Iterator<String> it = resultSet.iterator();
		while(it.hasNext()){
			String var = it.next();
			System.out.println(var);
		}
		/* o/p :
		computer
		first
		whatever
		second*/

		
		Container<Double,Integer> container1 = new Container<>(12.00, 12);
		double val3 = container1.getItem1();
		int val4 = container1.getItem2();
		System.out.println("val3 :"+val3 +" , val4 :"+val4 );// o/p : val3 :12.0 , val4 :12

	}
	public static <TT,DD,MMM, YYDDU> Set<TT> union(Set<TT> set1, Set<TT> set2){
		Set<TT> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}
}
