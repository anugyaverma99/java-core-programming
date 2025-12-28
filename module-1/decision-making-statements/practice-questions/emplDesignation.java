// WAJP to check which department and role an employee, belongs to based on user input.
// 1. IT -developer,tester,devops_engineer.
// 2. HR -recruiter, hr executive, payroll officer
// 3. Finance -accountant, financial analyst, auditor
// 4. Operations -operation executive, team lead, manager 

import java.util.Scanner;
public class emplDesignation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Which department you belong here? ");
		String dept=sc.nextLine();
		switch(dept){
		case "IT":
			System.out.print("Role selected by you: ");
			String roleit=sc.nextLine();
			System.out.print("the designation of employee is: ");
			switch(roleit){
			 case "Developer":
			 	System.out.println("Developer");
			 	break;
			 case "Tester":
			 	System.out.println("Tester");
			 	break;
			 case "Devops Engineer":
			 	System.out.println("Devops Engineer");
			 	break;
			 default:
			 	System.out.println("Invalid role selected");
			 	break;
			}
			break;
		case "HR":
			System.out.print("Role selected by you: ");
			String rolehr=sc.nextLine();
			System.out.print("the designation of employee is: ");
			switch(rolehr){
			 case "Recruiter":
			 	System.out.println("Recruiter");
			 	break;
			 case "hr executive":
			 	System.out.println("hr executive");
			 	break;
			 case "payroll officer":
			 	System.out.println("payroll officer");
			 	break;
			 default:
			 	System.out.println("Invalid role selected");
			 	break;
			}
			break;
		case "Finance":
			System.out.print("Role selected by you: ");
			String rolefi=sc.nextLine();
			System.out.print("the designation of employee is: ");
			switch(rolefi){
			 case "accountant":
			 	System.out.println("accountant");
			 	break;
			 case "financial analyst":
			 	System.out.println("financial analyst");
			 	break;
			 case "auditor":
			 	System.out.println("auditor");
			 	break;
			 default:
			 	System.out.println("Invalid role selected");
			 	break;
			}
			break;
		case "Operations":
			System.out.print("Role selected by you: ");
			String roleop=sc.nextLine();
			System.out.print("the designation of employee is: ");
			switch(roleop){
			 case "operation executive":
			 	System.out.println("operation executive");
			 	break;
			 case "Team lead":
			 	System.out.println("Team lead");
			 case "manager":
			 	System.out.println("manager");
			 default:
			 	System.out.println("Invalid role selected");
			 	break;
			}
			break;
		default:
			System.out.println("Invalid Department entered");
			break;
		}



	}
}