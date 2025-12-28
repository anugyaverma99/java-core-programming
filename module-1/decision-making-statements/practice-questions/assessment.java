import java.util.Scanner;
public class assessment{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		//STEP-1 INPUT DETAILS

		System.out.print("Enter the employee id: ");
		int empl_id=sc.nextInt();
		System.out.print("Enter the employee name: ");
		String empl_name=sc.next();
		System.out.print("Enter the employee age: ");
		int empl_age=sc.nextInt();
		System.out.print("Enter the department choice (1-IT , 2-HR , 3-Finance): ");
		int empl_dept=sc.nextInt();
		System.out.print("Enter the basic salary: ");
		int empl_base_salary=sc.nextInt();

		//STEP-2 AGE VALIDATION

		if(empl_age<21){
			System.out.println("EMPLOYEE IS NOT ELIGIBLE TO WORK.");
		}
		else{

			// STEP-3 DEPT. AND ROLE SELECTION(nested switch)

			int allowance=0; //in percentage
			String empl_role="";


			switch(empl_dept){
			case 1:
				System.out.print("select the role (deveoper,tester): ");
				String role_it=sc.next();
				
				switch(role_it){
				case "developer":
					empl_role="IT Developer";
					allowance=30;
					break;
				case "tester":
					empl_role="IT Tester";
					allowance=25;
					break;
				default:
					System.out.println("Invaild role selected by user. ");
				}
				break;
			case 2:
				System.out.print("select the role (recruiter, payroll): ");
				String role_hr=sc.next();
				
				switch(role_hr){
				case "recruiter":
					empl_role="HR Recruiter";
					allowance=20;
					break;
				case "payroll":
					empl_role="HR Payroll";
					allowance=22;
					break;
				default:
					System.out.println("Invaild role selceted by user. ");
				}
				break;
			case 3:
				System.out.print("select the role (accountant, auditor): ");
				String role_fi=sc.next();
				switch(role_fi){
				case "accountant":
					empl_role="Finance Accountant";
					allowance=28;
					break;
				case "auditor":
					empl_role="Finance Auditor";
					allowance=26;
					break;
				default:
					System.out.println("Invaild role selceted by user. ");
				}
				break;
			default:
				System.out.println("Invaild department selected by user. ");


			}

		// STEP-4 SALARY CALCULATION

			int empl_final_salary=empl_base_salary+(empl_base_salary*allowance/100);

		//STEP 5- ACCESS LEVEL DECISION
			String access_level;

			if(empl_final_salary>=60000 && empl_dept==1){
				access_level="Admin Access";
				
			}
			else if(empl_final_salary>=60000 ){
				access_level="Manager Access";
				}
			else{
				access_level="Employee Access";
			}

			System.out.println("TOTAL EMPLOYEE DETAILS: ");
			System.out.println("Employee ID: "+empl_id);
			System.out.println("Employee Name: "+empl_name);
			System.out.println("Employee department: "+empl_dept);
			System.out.println("Employee role: "+empl_role);
			System.out.println("Employee basic salary: "+empl_base_salary);
			System.out.println("Employee final salary: "+empl_final_salary);
			System.out.println("Employee Access level: "+access_level);



		}

	}
}