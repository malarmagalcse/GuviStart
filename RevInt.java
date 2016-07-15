package stringBuf;

public class RevInt {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer();
		str.append(args[0]);
		StringBuffer str1=new StringBuffer(str);
		str1=str1.reverse();
		System.out.println(str1);
		}
		}
