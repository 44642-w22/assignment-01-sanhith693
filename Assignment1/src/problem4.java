import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class problem4 {

	public static void main(String[] args) {
		Scanner sanhith = new Scanner(System.in);

		System.out.println("Enter the size of the list");
		int size = sanhith.nextInt();
		ArrayList<String> list =  new ArrayList<>(size);
		ArrayList<String> list2 =  new ArrayList<>(size);
		for(int i=0; i <size; i++) {
			System.out.print("Enter the string: ");
			String n = sanhith.next();
			list.add(n);
		}
		for(String s: list) {
			list2.add(s);
		}
		list2.sort((s1,s2) -> s1.length()-s2.length() );
		System.out.println(list2);
		
	}
}