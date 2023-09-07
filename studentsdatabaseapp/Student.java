package studentsdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	//Constructor prompts user to enter name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = sc.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = sc.nextLine();
		
		System.out.println("Enter Year: \n1 - First Year\n2 - Second Year\n3 - Third Year\n4 - Fourth Year");
		this.year = sc.nextInt();
		
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + year + " year" + " " + studentID);
	
		
	}
	//Generate an ID
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.studentID = year + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter couurse to enroll (Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equals("Q")) {
				courses = courses + " " + course;
				tuitionBalance = tuitionBalance + costOfCourse;				
			}
			else {
				break;
			}
		}while(1 != 0);
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your Balance is: " + tuitionBalance + " Rupees");
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your payment: ");
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank You for the payment of: " + payment +" Rupees");
		viewBalance();
	}
	//Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +"\nYear: " + year +  "\nCourses Enrolled: " + courses + "\nBalance: " + tuitionBalance + " Rupees";
	}
}
