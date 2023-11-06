package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		// List ---> ArrayList ,LinkedList,Stack,Queue

		List<String> l = new ArrayList<String>(); // Creation of arrayList

		List<String> a = new LinkedList<String>(); // Creation of LInkedLIst

		a.add("praveen"); // adding of elements
		a.add("venky");
		a.add(1, "Swetha");
		for (String a1 : a) {
			System.out.println(" a List :" + a1);
		}

		l.add(0, "Naveen"); // adding of elements in index wise order
		l.add("nknkn");

		l.addAll(a); // add the collection of data

		l.addAll(4, a); // Adding of collection in index order

		System.out.println(" Contains of a :" + a.contains("venky")); // it contains the element in list
		l.containsAll(a); // &&&&&&&&&&&&&&&
		System.out.println(" l array list contains a:" + l.equals(a));
		System.out.println("return the specified index" + l.get(4)); // return the element in the specified index
		// l.getClass() &&&&&&&&&&&&&&&
		System.out.println(" Generating hashcode in list l:  " + l.hashCode()); // hashcode of l
		System.out.println(" Generating hashcode in list a:  " + a.hashCode());

		System.out.println("indexof elemts:" + l.indexOf("praveen")); // index of elements
		System.out.println("indexof elemts:" + l.indexOf("Naveen"));
		System.out.println("list is empty:" + l.isEmpty());

		System.out.println("Indexof first occur element :" + l.indexOf("Na")); // &&&&&&&&&&&&&&

		System.out.println("lastindexof " + l.lastIndexOf("praveen")); // &&&&&&&&&&&

		System.err.println("Tostring method:" + l.toString());
		// l.toArray( a); //&&&&&&&&&&&
		System.out.println("Substring in array:" + l.subList(1, 4).toString());
		// l.stream() //&&&&
		// l.spliterator() &&&&&&&&&
		// System.out.println(l.sort());
		Collections.sort(l);
		

		System.out.println("Size of l collection:" + l.size());

		l.set(1, "Kalyan");
		System.out.println("After the sort operation:" + l.toString()); //
		System.out.println("After the sort operation:" + a.toString());
		
	   System.out.println( "Retain all :"+l.retainAll(a)); 
	   System.out.println("After the sort operation:" + l.toString()); //
		System.out.println("After the sort operation:" + a.toString());
		
	   l.remove(0); // in this Specified index

		Iterator<String> iterate = l.iterator();
		System.out.println("Using iterator:");
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}

	}

}
