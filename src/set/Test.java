package set;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "smample  text";
		str = str.replace("//s+", "");
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);				
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(map);

	}

}