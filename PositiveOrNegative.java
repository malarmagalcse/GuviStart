package logicBuilding;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		a=s.nextInt();
		if(a<0){
			System.out.println("The number is negative");
		}
		else if(a==0){
			System.out.println("The number is zero");
		}
		else{
			System.out.println("The number is positive");
		}
		s.close();
	}

}
