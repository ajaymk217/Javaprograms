package com.jsp.javaprograms.oops;

public class StudentInfo {

	public static void main(String[] args)
	{	
		student s1=new student();
		s1.SID=1;
		s1.name="Ajay";
		s1.Gender="male";
		s1.Age=22;
		s1.phno="7357664801";
		
		student.schoolName="jsp";
		student.schoolAddress="old airport road";

		
		s1.displayStudent();
		
		student s2=new student();
		s2.SID=2;
		s2.name="Nagaraja";
		s2.Gender="male";
		s2.Age=21;
		s2.phno="2355664801";
		
		
		student s3=new student();
		s3.SID=3;
		s3.name="shashi";
		s3.Gender="male";
		s3.Age=23;
		s3.phno="7327624501";
		
		student.ChangeSchoolName();
		student.ChangeSchoolAddress();
		s2.displayStudent();
		s3.displayStudent();

	}
}
class student 
{
	 int SID;
	 String name;
	 String Gender;
	 int Age;
	 String phno;
	 static String schoolName;
	 static String schoolAddress;
	 
	 public void displayStudent()
	 {
		 System.out.println("student ID=" +SID);
		 System.out.println("student name=" +name );
		 System.out.println("student gender=" +Gender);
		 System.out.println("student age ="+ Age);
		 System.out.println("student phone number= " + phno );
		 System.out.println("student schoolName=" + schoolName );
		 System.out.println("student schoolAddress=" +schoolAddress );
		 
		 
	 }
	 public static void ChangeSchoolAddress()
	 {
		 schoolAddress="marthali";
		 
	 }
	 public static void ChangeSchoolName()
	 {
		 schoolName="jspider";
	 }
	
}
