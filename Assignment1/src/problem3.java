import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> A1 = new ArrayList<Integer>();
		
		Scanner sanhith = new Scanner(System.in);
		System.out.println("Enter the length of ArrayList");
		int len = sanhith.nextInt();
		
		if(len != 0) {	
			System.out.println("Enter the list of Integers");
			for(int i=0; i<len;i++) {
				A1.add(sanhith.nextInt());
			}		
			System.out.println("List of Integers : " + A1);
	
			int max_int = A1.get(0) ;
			for(int e : A1) {
				max_int = Math.max(e,max_int);		
			}
			System.out.println("Maximum Integer is : " + max_int);
		}else {
			System.out.println(Integer.MIN_VALUE);
		}


	}

}