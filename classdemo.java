/* Question 1: Write a Java program to implement a Student Result System.
Create a class Student with attributes id, name, and marks.
Accept marks from the user and determine whether the student Passes or Fails.
If marks >= 35, print Pass, otherwise print Fail.
Asked In Practice assignment
Input:
Enter Student Id : 101
Enter Student Name : Rahul
Enter Marks : 72
*/
import java.util.*;
 class Student{
	 int id;
	 String name;
	 int marks;

public Student (int id,String name,int marks){
	this.id=id;
	this.name=name;
	this.marks=marks;
}
}
class classdemo{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the id ");
		 int id=sc.nextInt();
		 
		 sc.nextLine();
		 System.out.println("Enter the name ");
		 String name=sc.nextLine();
		 
		 System.out.println("Enter the marks of student ");
		 int marks=sc.nextInt();
		 
		 Student s=new Student(id,name,marks);
		 
		 String result=(s.marks >=35)?"pass":"Fail";
		 
		 System.out.println("Enter the student id "+s.id);
		 System.out.println("Enter the student name "+s.name);
		 System.out.println("Enter the marks of student "+s.marks);
		 System.out.println("Result is "+result);
	 
	 sc.close();
  }
}