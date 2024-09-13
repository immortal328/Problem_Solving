package problem_solving.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CapgmniTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Amar Pujari";
		
		Map<Character, Long> map =str.chars()
		.mapToObj(ch ->(char) ch)
		.filter(c -> !Character.isWhitespace(c))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		map.forEach((key,value)->{
			if(value >1) {
				System.out.println(key);				
			}
		});
		
		
		
//		//str = str.toLowerCase();		
//		String[] strArr = str.split("");
//		
//		Set<String> setChar = new HashSet<>();
//		
//		//Arrays.stream(strArr).
//		
//		for(String ch : strArr) {			
//			if(setChar.contains(ch)) {
//				System.out.println(ch+" ");				
//			}else {
//				setChar.add(ch)	;			
//			}			
//		}
		
	}

}
