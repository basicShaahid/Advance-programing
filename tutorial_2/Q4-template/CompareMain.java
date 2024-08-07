import java.util.Random;

public class CompareMain {

    // TODO: Implement a method printArray(Printable[] arr) that prints out each element within an array of Printables


    public static void sort(Comparable[] arr){
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].compareTo(arr[min_idx]) < 0)
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            Comparable temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        rnd.setSeed(0);
        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++){
            circles[i] = new Circle(rnd.nextDouble() * 10);
        }
        // TODO: print the array circles first (Hint, use the printArray(Printable[] arr) method that you implemented)
        //  Then sort the array circles (Hint: use the sort(Comparable[] arr) method).
        //  Finally, print the sorted circles array.
        


        EmployeePerson[] employees = new EmployeePerson[3];
        employees[0] = new EmployeeManager(2);
        employees[1] = new EmployeeStaff("Estrid");
        employees[2] = new EmployeeStaff("Estrid");
        employees[0].setData("Estrid", "Sales", "01-04-1989", 70000);
        employees[1].setData ("Michele",     "Sales", "02-02-1980", 50000);
        employees[2].setData ("Bob",     "Sales", "03-03-1975", 50000);

        // TODO: print the array employees first, then sort the array. Finally, print the sorted employees array.

    }
}
