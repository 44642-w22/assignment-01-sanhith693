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

public class problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> Q = new LinkedList<>();
		Queue<Integer> Q_even = new LinkedList<>();
		Queue<Integer> Q_odd = new LinkedList<>();

		Scanner sanhith = new Scanner(System.in);
		System.out.println("Enter the length of Queue");
		int len = sanhith.nextInt();
		
		System.out.println("Enter the list of Integers for Queue");
		for(int i=1; i<=len;i++) {
			Q.add(sanhith.nextInt());
		}
		
		System.out.println("List of Queue : " + Q);
		
		Queue<Integer> Q_dup = new LinkedList<>(Q);
		
		for(int e : Q_dup) {
			if(e%2==0) {
					Q_even.add(e);	
			}else{
					Q_odd.add(e);				
				}
		}
		
		
//		for(int i=1; i<=len;i++) {
//			if(!Q_dup.isEmpty()) {
//				if(i%2==0) {
//					if(!Q_dup.isEmpty()) {
//						Q_even.add(Q_dup.poll());	
//					}
//				}else {
//					if(!Q_dup.isEmpty()) {
//						Q_odd.add(Q_dup.poll());				
//					}
//				}	
//			}
//		}



		System.out.println("List of Queue : " + Q_dup);		
		System.out.println("List of Queue with odd index elements : " + Q_odd);
		System.out.println("List of Queue with even index elements : " + Q_even);
//		System.out.println("List of Queue : " + Q.element());
//		System.out.println("List of Queue : " + Q.peek());
		

		List<Integer> A = new ArrayList<Integer>(len);	
		
		for(int i=0;i<len;i++) {
				if(A.size()<len) {
					if(!Q_even.isEmpty()) {
						A.add(Q_even.poll());
					}
					if(A.size()<len) {
						if(!Q_odd.isEmpty()) {
							A.add(Q_odd.poll());	
						}
					}
				}
		}
		System.out.println("Output ArrayList : " + A);
		
	}

}