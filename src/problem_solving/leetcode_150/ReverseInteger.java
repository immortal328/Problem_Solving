package problem_solving.leetcode_150;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1234));
		System.out.println(reverse(-1234));
		System.out.println(reverse(1230));

	}
	
	public static int reverse(int x) {
        if(x < 0){
            return (int)reverseNumber(x*-1)*-1;
        }
        return (int) reverseNumber(x);
        
    }

    public static long reverseNumber(int num){
        long reverseNumber = 0;

        while(num > 0){
            int remainder = num%10;
            reverseNumber = (reverseNumber*10)+ remainder;
            num /= 10;
        }
        
        return reverseNumber;
    }

}
