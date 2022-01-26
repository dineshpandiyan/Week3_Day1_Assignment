package week3.day1.assignments.completed;

public class Student extends Department {
	
	
	public void studentName(){
		
		System.out.println("Student Class : studentName() method");
		
	}
	
	public void studentDept(){
		
		System.out.println("Student Class : studentDept() method");
		
	}
	
	public void studentId(){
		
		System.out.println("Student Class : studentId() method");
				
	}

	public static void main(String[] args) {
		
		Student obj = new  Student();
		
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		
		obj.deptName();
		
		obj.studentId();
		obj.studentName();
		obj.studentDept();
		

	}

}
