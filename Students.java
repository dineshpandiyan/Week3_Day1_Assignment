package week3.day1.assignments.completed;

public class Students {
	
	int id;
	String name,email;
	double phoneNumber;
	
	public void getStudentInfo(int id){
		
		this.id = id;
		
		System.out.println("getStudentInfo method : " + id);
				
		
	}
	
	public void getStudentInfo(int id, String name){
		
		this.id=id;
		this.name=name;
		
		System.out.println("getStudentInfo method : " + id + " >> " + name);
				
		
	}
	
	public void getStudentInfo(String email, long phoneNumber){
		
		this.email=email;
		this.phoneNumber=phoneNumber;
		
		System.out.println("getStudentInfo method : " + email + " >> "  + phoneNumber);
		
	}
	
	public static void main(String args[]) {
		
		
		Students obj = new Students();
		
		obj.getStudentInfo(5);
		
		obj.getStudentInfo(5, "Dinesh");
		
		obj.getStudentInfo("test@test.com", 1234567891);		
		
		
	}

}
