public class Operators{
    public static void main(String args[]){
    double monthly_salary=45000;
    int tax_rate=8;
    double general_deduction=7000;
    int years_of_Service=5;
    double net_salary=monthly_salary-(0.08*monthly_salary)-general_deduction;
    String is_bonus_elgible=(years_of_Service>3)?"Yes":"No";
    String is_tax_elgible=(tax_rate>0)?"Tax Applicable":"Tax Not Applicable";
    System.out.println("Net Salary = "+net_salary);
    System.out.println("Bonus Eligible: "+is_bonus_elgible);
    System.out.println(is_tax_elgible);
    }


}