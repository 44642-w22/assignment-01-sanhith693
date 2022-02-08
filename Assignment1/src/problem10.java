import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> D = new ArrayDeque<>();
		List<Integer> A = new ArrayList<>();	
		

		Scanner sanhith = new Scanner(System.in);
		System.out.println("Enter the length of Deque");
		int len = sanhith.nextInt();
		
		System.out.println("Enter the list of Characters for Deque");
		for(int i=1; i<=len;i++) {
			D.add(sanhith.next());
		}
		
		System.out.println("Enter the length of Array of operations");
		int len_array = sanhith.nextInt();
		
		System.out.println("Enter the Array of operations in 1 and 0 ");
		for(int i=1; i<=len_array;i++) {
			A.add(sanhith.nextInt());
		}
		
		System.out.println("List of Deque : " + D);
		System.out.println("Array of operations : " + A);
		
		Deque<String> D_dup = new LinkedList<>(D);
		Stack<String> S = new Stack<>();
		
		for(int e : A) {
			switch(e) {
			 	case 1: if(!D_dup.isEmpty()) {
			 		S.add(D_dup.pollFirst());
			 		break;
			 	}
			 	case 0: if(!S.isEmpty()) {
			 		D_dup.addFirst(S.pop());
			 		break;
			 	}
			}
		}
		
//		System.out.println("Output : " + D_dup);
//		System.out.println("Stack : " + S);
		
		Iterator<String> objIterator = D_dup.iterator();  
		while(objIterator.hasNext())
		{
			System.out.print(objIterator.next());
		}
	}
}
	

	


