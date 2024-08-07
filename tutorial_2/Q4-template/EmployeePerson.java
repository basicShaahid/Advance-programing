abstract class EmployeePerson implements Printable, Comparable{
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

    public void setData(String empFullName, String empDepartmentCode,
                        String empBirthday, int empAnnualSalary) {
        fullName       = empFullName;
        departmentCode = empDepartmentCode;
        birthday       = empBirthday;
        annualSalary   = empAnnualSalary;
    }

    // ***********************************************************************

    // TODO Create a Constructor with parameters to set the private variables
    //  Hint: Use the setData method


    // ***********************************************************************

    // TODO Create an abstract method int getAnnualBonus()


    // TODO: (Stage 2) Implement compareTo(Object o) method.

}
