import java.util.Scanner;
class TaxOnSalary{
	private double salary;
	private boolean isPANsubmitted;
	
	//Constructors
	TaxOnSalary(boolean isPANsubmitted){
		this.isPANsubmitted=isPANsubmitted;
		this.salary=1000.00;
	}	
	TaxOnSalary(){		
	}
	public double getSalary(){
		return salary;
	}
	public boolean getIsPANsubmitted(){
		return isPANsubmitted;
	}
	@SuppressWarnings("resource")
	public void inputSalary(){
		Scanner sc = new Scanner(System.in);
		salary=sc.nextDouble();
	}
	
	public double caculateTax(){
		if(salary < 180000 && isPANsubmitted == true){
			return 0;
		}
		else if(salary < 180000 && isPANsubmitted == false){
			return 0.05*salary;
		}
		else if( salary < 500000){
			return 0.1*salary;
		}
		else if( salary < 1000000){
			return 0.2*salary;
		}
		else{
			return 0.3*salary;
		}
	}
}