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

public class problem1 {
	public static void main(String[] args) {
		
	List<Integer> L1 = new LinkedList<Integer>();
	
	Scanner sanhith = new Scanner(System.in);
	System.out.println("Enter the length of linkedlist");
	int len = sanhith.nextInt();
	
	System.out.println("Enter the list of Integers");
	for(int i=0; i<len;i++) {
		L1.add(sanhith.nextInt());
	}
	System.out.println("List of Integers : " + L1);
	
	List<Integer> L2 = new LinkedList<Integer>();
	for(int e : L1) {
		if(perfectNum(e) == e) {
			L2.add(e);
		}
	}
	System.out.println("List of Perfect Numbers : " + L2);
	
}

public static int perfectNum(int N) {
	int sum_divisors = 0;
	for(int i = 1; i<N ;i++) {
		if (N%i == 0) {
			sum_divisors += i;
		}else {
			sum_divisors += 0;
		}
	}
	return sum_divisors;
}	
}


	








