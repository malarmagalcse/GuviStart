package day.two;

public class SumOfOdd {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int digit,rem,odd=0;
		while(number>0){
            digit = number % 10;
            number = number / 10;
            rem = digit % 2;
            if(rem != 0)
            odd=odd+digit;
            else
            continue;
            }
		System.out.println("Sum:"+odd);

	}

}
