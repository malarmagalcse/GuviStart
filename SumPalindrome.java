package day.one;

public class SumPalindrome {

	public static void main(String[] args) {
		int number = 12345;

		int sum = 0;
		int digit;
		for (int i = number; i % 10 != 0; i = i / 10) {
			digit = i % 10;
			sum += digit;
		}
		StringBuffer str=new StringBuffer(Integer.toString(sum));
		
		System.out.println(str);
		
		StringBuffer str1=new StringBuffer(str);
		
		str1=str1.reverse();
		
		System.out.println(str1);
		
		if(str.toString().equals(str1.toString())){
			System.out.println(str+" is a palindrome");
		}
		else{
			System.out.println(str+" is not palindrome");
		}

	
	}

}
