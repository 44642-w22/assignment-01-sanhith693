import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Queue<Integer> Q = new LinkedList<>();
		
		Scanner sanhith = new Scanner(System.in);
		System.out.println("Enter the length of Queue");
		int len = sanhith.nextInt();
		
		System.out.println("Enter the list of Integers for Queue");
		for(int i=1; i<=len;i++) {
			Q.add(sanhith.nextInt());
		}
		
		System.out.println("List of Queue : " + Q);
		
		Stack<Integer> S = new Stack<>();
		
		Iterator<Integer> objIterator = Q.iterator();  
		while(objIterator.hasNext())
		{
			S.add(objIterator.next());
		}
		
		List<Integer> A = new ArrayList<Integer>(len);	
		
		for(int i=0;i<len;i++) {
				if(A.size()<len) {
					A.add(S.get(len-i-1));
					if(A.size()<len) {
						A.add(S.get(i));
					}
				}
		}
		System.out.println("Output ArrayList : " + A);
	}

}