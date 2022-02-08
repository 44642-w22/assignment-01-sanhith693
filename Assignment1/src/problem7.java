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

public class problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> Q = new LinkedList<>();
		
		Scanner sanhith = new Scanner(System.in);
		System.out.println("Enter the length of Queue");
		int len = sanhith.nextInt();
		
		System.out.println("Enter the list of Queue with 0's and 1's");
		for(int i=1; i<=len;i++) {
			Q.add(sanhith.nextInt());
		}

		System.out.println("List of Queue : " + Q);
		
		int Output = 0;
		int index = len-1;
		for(int e : Q) {
			Output += e*(Math.pow(2,index));
			index--;
		}
		System.out.println("Output : " + Output);
	}

}