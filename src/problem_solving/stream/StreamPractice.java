package problem_solving.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {
	public static void main(String[] args) {		
		//find vowels
		String str1 =" Amar Pujari ";
		str1.toLowerCase();
		String vowels ="aeiou";
		
		List<Character> charVowels = str1.chars()
		.mapToObj(chars -> (char) chars)
		.filter(ch -> vowels.indexOf(ch) != -1)
		.collect(Collectors.toList());
		System.out.println("List of Character which are vowels "+ charVowels.toString());
		
		
		System.out.println("Playing with String[] of Character");
		str1 = str1.replaceAll("\\s+", "");
		System.out.println(str1);
		
		str1 = str1.trim();
		String[] str1Array = str1.split("");	
		Map<String, Long> mapOfChar = Arrays.stream(str1Array)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		mapOfChar.forEach((key,value)->{
			System.out.println(key +" --> "+value);
		});	
		
		System.out.println();		
		
		System.out.println("Playing with String[] of Words");		
		String str = "there is tree tree is tree and tree is very far";
		
		String[] strArray = str.split(" ");		
		Map<String, Long> mapOfWord = Arrays.stream(strArray)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));		
		mapOfWord.forEach((key, value)->{
			if(value >=2) {
				System.out.println(key +" --> "+value);				
			}
		});
		
		//employeeOperation();		
		//employeeListOperation();
		findKthLargest(3);

	}

	public static void employeeOperation() {
		List<Employee> employees = new ArrayList<>();
		Employee employee1 = new Employee("Amar", "Pujari", "IT", 3, 1300000.0);
		Employee employee2 = new Employee("Nishat", "Supari", "IT", 3, 1000000.0);
		Employee employee3 = new Employee("Ajit", "Someswar", "APPS", 3, 800000.0);
		Employee employee4 = new Employee("Kavit", "Rathod", "WPS", 5, 320000.0);
		Employee employee5 = new Employee("Samir", "Kake", "BPO", 3, 3000000.0);
		Employee employee6 = new Employee("Amir", "Save", "IT", 3, 1300000.0);

		employees.add(employee1);employees.add(employee2);employees.add(employee3);
		employees.add(employee4);employees.add(employee5);employees.add(employee6);
		
		List<String> empSalGreaterThanTenLPA = employees.stream()
				.filter(emp -> emp.getSalary() >1000000.0)
				.filter(emp -> emp.getFirstName().startsWith("A"))
				.map(emp -> emp.getFirstName())
				.collect(Collectors.toList());
		
		System.out.println(empSalGreaterThanTenLPA);	
		System.out.println();
	}
	
	public static void employeeListOperation() {
		System.out.println("Flat Map Working");
		
		List<List<Employee>> employees = new ArrayList<>();
		
		List<Employee> employeeList1 = new ArrayList<>();
		Employee employee1 = new Employee("Amar", "Pujari", "IT", 3,  1300000.0);
		Employee employee2 = new Employee("Anar", "Spari", "IT", 3,   1000000.0);
		Employee employee3 = new Employee("Ajit", "Puri", "APPS", 3,  800000.0);
		
		
		employeeList1.add(employee1);
		employeeList1.add(employee2);
		employeeList1.add(employee3);
		
		List<Employee> employeeList2 = new ArrayList<>();
		Employee employee4 = new Employee("Avi", "Pujari", "WPS", 5,  320000.0);
		Employee employee5 = new Employee("Amit", "Pujari", "BPO", 3, 3000000.0);
		Employee employee6 = new Employee("Amir", "Puari", "IT", 3,   1300000.0);
		employeeList2.add(employee4);
		employeeList2.add(employee5);
		employeeList2.add(employee6);
		
		employees.add(employeeList1);
		employees.add(employeeList2);
		
		
		List<Employee>  allEmp = employees.stream()
			.flatMap(list -> list.stream())
			.filter(emp -> emp.getDepartment().equalsIgnoreCase("IT"))
			.map(data -> data)
			.collect(Collectors.toList());
		
		System.out.println("After FlatMap -> "+allEmp.size());
	}
	
	public static void findKthLargest(long n) {
		System.out.println();
		int[] nums = {3,4,5,6,1,23,9};

		System.out.println("size "+ nums.length);

		IntStream nums1 = Arrays.stream(nums).sorted();
		OptionalInt maxNum = Arrays.stream(nums).max();
		OptionalInt minNum = Arrays.stream(nums).min();
		int totalSum = Arrays.stream(nums).sum();
		OptionalInt kthLargets = Arrays.stream(nums).sorted().skip(nums.length-n).findFirst();
		OptionalInt kthSmallets = Arrays.stream(nums).sorted().skip(n-1).findFirst();
		
		nums1.forEach(i->{System.out.print(i+" ");});
		System.out.println();
		System.out.println("Total Sum "+totalSum);
		System.out.println("Max Number "+maxNum.orElseGet(null));
		System.out.println("Min Number "+minNum.orElseGet(null));
		System.out.println("kth Largest -> "+ kthLargets.orElseGet(null));
		System.out.println("kth Smallest -> "+ kthSmallets.orElseGet(null));
		
	}
}
