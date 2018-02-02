//Jack Hosier, Java Variables and Types 
package payroll_program;

public class payrollProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long hoursWorked;
		hoursWorked = 40;
		
		double payRate;
		payRate = 10.0;
		
		double taxRate;
		taxRate = 0.10;
		
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("pay Amount: " + (hoursWorked * payRate));
		System.out.println("tax Amount: " + (hoursWorked * payRate * taxRate));

	}

}
