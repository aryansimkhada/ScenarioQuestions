class Employee{
    double basicSalary;
    double GrossSalary;
    
    Employee(double b){
        basicSalary = b;
    }
    
    double calculateGrossSalary(){
        GrossSalary = basicSalary + basicSalary * 0.5;
        System.out.println("Your gross salary is: " + GrossSalary);
        return GrossSalary;
    }
}

public class EmployeeSalary{
    public static void main(String[] args){
        Employee a = new Employee(10000.0);
        System.out.println("Your basic salary is: " + a.basicSalary);
        a.calculateGrossSalary();
    }
}
