abstract class EmployeePerson implements Printable, Comparable {
    protected String fullName;       // In the format last name, first name
    protected String departmentCode;
    protected String birthday;
    protected int annualSalary;

    // Default constructor. Set protected variables to the empty string or 0
    public EmployeePerson() {
        fullName = "";
        departmentCode = "";
        birthday = "";
        annualSalary = 0;
    }

    // ***********************************************************************
    // Constructor with parameters to set the private variables
    public EmployeePerson(String empFullName, String empDepartmentCode,
                          String empBirthday, int empAnnualSalary) {
        setData(empFullName, empDepartmentCode, empBirthday, empAnnualSalary);
    }
    // ***********************************************************************

    public void setData(String empFullName, String empDepartmentCode,
                        String empBirthday, int empAnnualSalary) {
        fullName       = empFullName;
        departmentCode = empDepartmentCode;
        birthday       = empBirthday;
        annualSalary   = empAnnualSalary;
    }

    // ***********************************************************************
    // Abstract method to be implemented by subclasses
    public abstract int getAnnualBonus();
    // ***********************************************************************

    // TODO: Implement compareTo method
    public int compareTo(EmployeePerson o) {
        return Integer.compare(this.annualSalary, o.annualSalary);
    }
}
