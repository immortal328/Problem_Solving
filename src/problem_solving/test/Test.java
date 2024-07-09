package problem_solving.test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr =  new ArrayList<>();
		
		for(int i=1;i<1000;i++) {
			arr.add(i);
		}
		//arr.forEach();
		
		
		LocalTime time=null;
		for(int i=0;i<arr.size();i++) {
			time = LocalTime.now();
			System.out.print(arr.get(i)+" ");
		}
		 //= LocalTime.now();
		System.out.println(time);
		System.out.println(LocalTime.now());
		
		//arr.stream().co
		

	}

}
