package first;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		Stack<Integer> l = new Stack<>();
		l.push(12);
		l.push(20);
		l.add(5);
		l.add(5);
		l.push(8); // adding of elements in stack

		System.out.println("Capacity of stack: " + l.capacity());
		System.out.println("size of elements:" + l.size());
		System.out.println("pop element " + l.pop());
		System.out.println(l.peek());
		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}

	}
}
