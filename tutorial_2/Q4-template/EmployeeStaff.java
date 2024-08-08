public class EmployeeStaff extends EmployeePerson {
    private String managerName;

    // ***********************************************************************
    // Constructor to initialize managerName
    public EmployeeStaff(String managerName) {
        this.managerName = managerName;
    }
    // ***********************************************************************

    // TODO: Implement method getManagerName()
    public String getManagerName() {
        return managerName;
    }
    // ***********************************************************************

    // TODO: Implement the printInfo method from Printable interface
    @Override
    public void printInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Department Code: " + departmentCode);
        System.out.println("Birthday: " + birthday);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Manager Name: " + managerName);
    }
    // ***********************************************************************

    // TODO: Implement the getAnnualBonus method. A staff's annual bonus
    //       is calculated as 7.5% of the employee's annual salary.
    @Override
    public double getAnnualBonus() {
        return annualSalary * 0.075; // 7.5% of the annual salary
    }
    // ***********************************************************************
}
