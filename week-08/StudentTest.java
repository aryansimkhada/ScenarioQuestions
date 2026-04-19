class Student{
    int id;
    String name;
    String address;
    long phoneNumber;
    String collegeName;
    
    Student(int i, String n, String a, long p, String c){
        id = i;
        name = n;
        address = a;
        phoneNumber = p;
        collegeName = c;
    }
    void displayInfo(){
        System.out.println("Student ID: " +id);
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Address: " + address);
        System.out.println("Student's Phone Number: " + phoneNumber);
        System.out.println("Student's College: " + collegeName);
    }
}
public class StudentTest{
    public static void main(String[] args){
        Student a = new Student(1,"Aryan","Simkhada",911911911,"Islington");
        a.displayInfo();
    }
}
