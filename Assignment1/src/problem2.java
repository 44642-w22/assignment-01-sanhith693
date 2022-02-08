import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
public class problem2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> L1 = new LinkedList<Integer>();
		
		Scanner sanhith = new Scanner(System.in);
		System.out.println("Enter the length of linkedlist");
		int len = sanhith.nextInt();
		
		System.out.println("Enter the list of Integers");
		for(int i=0; i<len;i++) {
			L1.add(sanhith.nextInt());
		}
		
		System.out.println("Enter value of k");
		int k = sanhith.nextInt();
		
		System.out.println("List of Integers : " + L1 + " k = " + k);
		
		List<Integer> AL2 = new ArrayList<Integer>();
		
		for(int i=0; i<len-1 ; i++) {
			int sum = L1.get(i) + L1.get(i+1);
			System.out.println(sum);
			if (sum == k) {
				AL2.add(L1.get(i));
				AL2.add(L1.get(i+1));
				
				addPair(L1.get(i),L1.get(i+1));
				System.out.println("List of pairs: " + addPair(L1.get(i),L1.get(i+1)));
				System.out.println("List of pairs: " + AL2);

			}
			sum = 0;
		}
		System.out.println("List of pairs : " + AL2);
		
	}
	
	public static <E> LinkedList<E> addPair(E first, E second) {
	    LinkedList<E> pairList = new LinkedList<E>();
	    pairList.add(first);
	    pairList.add(second);
		return (LinkedList<E>) pairList;
	    
	    
	}


}


