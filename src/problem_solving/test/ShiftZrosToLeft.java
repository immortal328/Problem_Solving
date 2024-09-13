package problem_solving.test;

public class ShiftZrosToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,0,0,3,0,4,0,0,5,6};
		System.out.println(" : "+arr1.length);
		shiftZrosToLeft(arr1);
		System.out.println();
		int[] arr2 = {0,0,0,0,0,0,0,0,5,6,1,3,4,5,8};
		System.out.println(" : "+arr2.length);
		shiftZrosToLeft(arr2);

	}
	
	public static void shiftZrosToLeft(int[] arr) {
		int i=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
				i++;
			}
		}
		
		
		for(int j :arr) {
			System.out.print(j+" ");
		}
		System.out.println(" : "+arr.length);
	}

}
