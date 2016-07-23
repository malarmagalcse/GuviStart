
package rc;

import java.util.Scanner;

public class RowColoumnl {

    public static void main(String[] args) {
        
        int row,i,j,col,temp,k = 0;
        int[] arr=new int[100];
        int[][] arr1=new int[10][10];
Scanner sc=new Scanner(System.in);  
        System.out.println("enter row and coloumn");
 row=sc.nextInt();
col=sc.nextInt();
for(i=0;i<col*row;i++)
arr[i]=sc.nextInt();
for(i=0;i<row*col;i++)
for(j=i+1;j<row*col;j++)
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
for(i=0;i<row;i++)
for(j=0;j<col;j++)
{
arr1[i][j]=arr[k];
k++;
}
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
    System.out.print(arr1[i][j]);
}
    System.out.println(" ");
    }
}}
