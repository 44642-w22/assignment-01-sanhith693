import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> S = new Stack<>();
		
		Scanner sanhith = new Scanner(System.in);
		System.out.println("Enter the length of Stack");
		
		int len = sanhith.nextInt() ;
		if(len%2 == 0) { 
			System.out.println("Enter the list of Stack");
			for(int i=0; i<len;i++) {
				S.add(sanhith.nextInt());
			}
			System.out.println("List of Integers : " + S);
			
			List<Integer> A = new ArrayList<Integer>();
			
			for(int i=len;i>len/2;i--) {
				A.add(S.get(i-1));
			}
			for(int i=0;i<len/2;i++) {
				A.add(S.get(i));
			}
			System.out.println("List of Integers : " + A);
			
		}else {
			System.out.println("Enter the even number for length of the Stack");
		}
		
	}

}