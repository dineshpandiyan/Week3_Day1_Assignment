package week3.day1.assignments.completed;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		
		int axisDeposit = 200000;
		
		System.out.println("From Axis Bank Class : " + axisDeposit);
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		obj.deposit();
		

	}

}
