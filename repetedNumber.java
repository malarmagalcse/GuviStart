package demo.programs;

public class RepeatedNumber {

	public static void main(String[] args) {
		int[] arr={2,7,31,44,19,2,33,78,62};
		int flag=0;
		int i,j;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					flag=1;
				}
			}
			if(flag==1){
				break;
			}
		}
		System.out.println(arr[i]);
	}

}
