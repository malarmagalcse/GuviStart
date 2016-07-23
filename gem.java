package gem;
import java.util.Scanner;

public class Apple {
public static void main(String[] args, int i) {
String s="hello";
for( i=0;i<=s.length();i++)
{
    char e=s.charAt(i);
    if((e== 'A')||(e=='E')||(e=='I')||(e=='O')||(e=='U')){
        {
String h=s.substring(0, i);

String g=s.substring(i+ i);
s=h+"Z"+g;
}}
}
    System.out.println("The result is="+s);
}}
