public class EmployeeManager extends EmployeePerson {
    private int numManaged;

    // ***********************************************************************
    // Constructor to initialize numManaged
    public EmployeeManager(int nManaged) {
        this.numManaged = nManaged;
    }
    // ***********************************************************************

    // TODO: Implement the method getNumManaged()
    public int getNumManaged() {
        return numManaged;
    }

    // ***********************************************************************
    // Implement the method printInfo() from Printable interface
    @Override
    public void printInfo() {
        super.printInfo(); // Call the parent class's printInfo() method
        System.out.println("Number of Employees Managed: " + numManaged);
    }
    // ***********************************************************************

    // TODO: Implement the getAnnualBonus method. A manager's annual bonus
    //       is calculated as 10% of the manager's annual salary.
    public double getAnnualBonus() {
        return salary * 0.10; // Assuming salary is inherited from EmployeePerson
    }
    // ***********************************************************************
}
