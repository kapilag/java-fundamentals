package abstraction.encapsulation;

public class main {

    public static void main(String [] args){
        EmployeeDetails edetail = new EmployeeDetails("Sonal", "Priya");
        edetail.setDepartment("Quality Assurance");
        System.out.println(edetail.detailsOfEmployee());
        edetail.setDepartment("Iteration Management");
        System.out.println(edetail.detailsOfEmployee());
    }
}
