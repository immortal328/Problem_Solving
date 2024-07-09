package problem_solving.test;

import java.util.ArrayList;
import java.util.List;

public class MidSum {
	
	public static void main(String[] args) {
		List<Integer> students = new ArrayList<Integer>();
		students.add(1);
		students.add(7);
		students.add(3);
		students.add(6);
		students.add(5);
		students.add(6);
		System.out.println(find_pivot(students));
	}
	
	public static int find_pivot(List<Integer> students) {
		// Write your code here
		int left=0;
		int  right = students.size()-1;
		int leftSum = students.get(left);	
		int rightSum = students.get(right);

		while( leftSum != rightSum ){
			if(left < right){
			leftSum = leftSum + students.get(++left);
			rightSum = rightSum + students.get(--right);
			}else{
				return -1;
			}
		}
		return left+1;		
	}

}
