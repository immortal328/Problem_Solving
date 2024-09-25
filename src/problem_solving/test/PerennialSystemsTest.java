package problem_solving.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PerennialSystemsTest {

	public static void main(String[] args) {
		String str ="cat act tac saw aws pin";
		String[] strArray = str.split(" ");
		List<String> ans = getListWithAnagram(strArray);
		
		String[] finalArr = ans.toArray(new String[0]);		
		printArray(finalArr);
	}
	
	private static void printArray(String[] finalArr) {
		for(int i=0;i<finalArr.length;i++) {
			System.out.print(finalArr[i]+" ");			
		}
		
	}

	public static List<String> getListWithAnagram(String[] strArray){
		Map<String,List<String>> map = new HashMap<>();
		
		for(String str : strArray) {
			List<String> strList = null;
			char[] charArry =str.toCharArray();
			Arrays.sort(charArry);
			
			if(map.containsKey(String.valueOf(charArry))) {
				strList = map.get(String.valueOf(charArry));				
			}else {
				strList = new ArrayList<>();
			}
			strList.add(str);
			map.put(String.valueOf(charArry), strList);	
		}
		
		List<String> stringOfList =new ArrayList<>();		
		for(Map.Entry<String, List<String>> entry : map.entrySet()) {
			if(stringOfList.size() <= entry.getValue().size()) {
				stringOfList = entry.getValue();				
			}			
		}
		
		return stringOfList;
	}

}
