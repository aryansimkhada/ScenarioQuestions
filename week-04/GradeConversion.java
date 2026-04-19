import java.util.Scanner;

public class GradeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the GPA (0.0 - 4.0)");
        double gpa = sc.nextDouble();
        
        if (gpa < 0.0 || gpa > 4.0)
        {
            System.out.println("ERROR: The entered GPA is invalid!!!");
    
        }
        else {
            if (gpa > 3.6)
            {
                System.out.println("Grade = A+");
            }
            else if (gpa > 3.2)
            {
                System.out.println("Grade = A");
            }
            else if (gpa > 2.8)
            {
                System.out.println("Grade = B");
            }
            else if (gpa > 2.4)
            {
                System.out.println("Grade = C");
            }
            else if (gpa > 2)
            {
                System.out.println("Grade = D");
            }
            else 
            {
                System.out.println("FAIL!!!");
            }
        }
        
        
    }
}
