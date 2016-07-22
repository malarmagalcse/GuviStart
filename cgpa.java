mport java.util.Scanner;

public class number
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the number of course: ");
        int num=input.nextInt();
        
        //array
        String grade[] = new String[num];
        int creditHour[] = new int [num];
        double creditValue[] = new double [num];
        
        int totCredit = 0;
        double totGPA = 0;
        
        for (int i=0; i
        {
            System.out.print("Grade: ");
            grade[i] = input.next();
            
            System.out.print("Credit hour: ");
            creditHour[i] = input.nextInt();
            
            
            switch (grade[i])
            {
                case "A": creditValue[i]=4.00;break;
                
                case "A-": creditValue[i]=3.75; break;
                
                case "B+": creditValue[i]=3.50; break;
                
                case "B": creditValue[i]=3.00; break;
                
                case "B-": creditValue[i]=2.75; break;
                
                case "C+": creditValue[i]=2.50; break;
                
                case "C": creditValue[i]=2.00; break;
                
                case "D": creditValue[i]=1.00; break;
                
                case "F": creditValue[i]=0.00; break;
                
                default: System.out.println("ERROR!");
            }
            
            totGPA = totGPA+(creditValue[i]*creditHour[i]);
            totCredit+=creditHour[i];
        }
   
        double CGPA = totGPA / totCredit;
        
        System.out.printf("GPA: %.2f ", totGPA);
        System.out.printf("Total credit: %d ", totCredit);
        System.out.printf("CGPA: %.2f", CGPA);
    }
}
