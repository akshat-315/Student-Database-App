package studentsdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	
	public static void main(String[] args) {
		//Ask how many users we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student[] students = new Student[numOfStudents];
		
 		//Create n number of students
		for(int i = 0; i<numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			System.out.println();
			students[i].payTuition();
			System.out.println();
			System.out.println(students[i].showInfo());
			System.out.println();
		}
	}
	
}
