package abstraction.encapsulation;

public class EmployeeDetails {

    private String fName;

    public EmployeeDetails(String fName) {
        this.fName = fName;
    }

    private String lName;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;


    public EmployeeDetails(String firstName, String lastName){
        this.fName = firstName;
        this.lName = lastName;
    }


    public String detailsOfEmployee(){
        return "Employee name is: "+fName+" "+lName+" and works in department:"+ department;
    }
}
