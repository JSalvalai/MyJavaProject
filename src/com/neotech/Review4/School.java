package com.neotech.Review4;

public class School {

	public static void main(String[] args) {
		
		//School s = new School();
		
		Student student1 = new Student();
		student1.name = "Biden";
		student1.studentNr = 46;
		student1.gradeLevel = 10;

		Student student2 = new Student();
		student2.name = "Donald";
		student2.studentNr = 47;
		student2.gradeLevel = 8;
		
		Teacher teacher = new Teacher();
		teacher.name = "Jackeline";
		teacher.salary = 75000;
		teacher.subject = "Math";
		
		//Re-assigning the subject
		teacher.subject = "Java";
		
		System.out.println("Let's call the methods!");
		
		student2.study();
		
		student1.sleep();
		student2.sleep();
		
		teacher.teach();
		teacher.yellAtStudent("Elon Musk");
		
	}

}
