package Algorithm;

import java.util.List;
import java.util.ArrayList;

public class insertSorting {
	
	public static void main(String[] args){
		
		List<Integer> li= new ArrayList<Integer>();
		
		li.add(6);
		li.add(4);
		li.add(8);
		li.add(1);
		li.add(3);
		li.add(34);
		li.add(12);
		li.add(9);
		li.add(3);
		li.add(12);
		li.add(34);
		li.add(1);
		li.add(8);
		li.add(93);
		li.add(23);
		
		System.out.println("Before sorting");
		
		for(int i=0;i<li.size();i++){
			System.out.print(li.get(i)+",");
		}
		
		System.out.println(" ");
		
		List<Integer> sortedList = new ArrayList<Integer>();
		
		int si=0;
		
		for(int i=0;i<li.size();i++){
			while(si<sortedList.size()&&sortedList.get(si)<li.get(i)){
				si++;
			}
			sortedList.add(si, li.get(i));
			si=0;
		}
		
		System.out.println("After sorting");
		
		for(int i=0;i<sortedList.size();i++){
			System.out.print(sortedList.get(i)+",");
		}
		
		System.out.println(" ");
	}
}
