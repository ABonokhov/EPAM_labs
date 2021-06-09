package by.gsu.epamlab;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;


public class Runner {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(7, "Karim Bataev", 1234, 12),
                new Employee(8, "Alexei Zareckiy", 1632, 11),
                null,
                new Employee(6, "Alesya Chernitskaya", 985, 7),
                new Employee(),

        };
        int max = 0;
        for (Employee employee : employees) {                    // cycle for calculate business trip with maximum cost
            if (employee != null && employee.getTotal() > max) {
                max = employee.getTotal();
            }
            if (employee != null) {
                employee.show();                        // using show( ) method for output array to the console
                System.out.println("___________________");

            }
            employees[4].setTransport(1649);           // Update  transportation expenses for the last object of the array
        }


        System.out.println("Duration = " + (employees[0].getDays() + (employees[1].getDays()))); // Output the total duration of two initial business trips
        System.out.println(Arrays.toString(employees)); //  Output the array content to the console using toString()


        System.out.println("Maximum cost is  " + max);

       /* int wholeNum = 17;
        int change = 20;
        String str = String.format("%,d.%02d", wholeNum, change);
        System.out.println(str);

        System.out.println("Maximum cost is  " + str); */



    }
}








