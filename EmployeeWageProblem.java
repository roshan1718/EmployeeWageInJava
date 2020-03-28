// Description : Employee Wage Problem
// Author : Roshan Balkrushna Shinde
// Since 28 March 2020 

public class EmployeeWageProblem{
int totalSalary=0;
	public static void main ( String args[] ){

		EmployeeWageProblem employee= new EmployeeWageProblem();
		employee.wageCalculation("BMC",20,20,100);
		employee.wageCalculation("TCS",25,30,90);

}



public void wageCalculation( String cName,int MAX_DAYS, int WAGE_PER_HOUR, int MAX_HOURS ) {
	int salary=0, totalEmpHours=0, noOfDays=0;
	final int IS_FULLTIME=1, IS_PARTTIME=2 ;

		while ( totalEmpHours < MAX_HOURS && noOfDays < MAX_DAYS ){
			int checkNumber=(int)(Math.floor(Math.random()*10)%3);
			int empHours=0;
			noOfDays+=1;
			switch (checkNumber){
				case IS_FULLTIME:
					System.out.println("Employee Is Full Time..!");
					empHours=8;
					break;
				case IS_PARTTIME:
					System.out.println("Employee Is Part Time..!");
					empHours=4;
					break;
				default:
					System.out.println("Employee Is Absent..");
					empHours=0;
					break;
			}
			salary=empHours*WAGE_PER_HOUR;
			totalEmpHours+=empHours;
			System.out.println("Salary of Employee on "+noOfDays+ "th Day is.."+salary);
			totalSalary+=salary;
		}
    System.out.println("Company name is:: "+cName+" ToTal Salary of Employee is::"+ totalSalary);
}

}
