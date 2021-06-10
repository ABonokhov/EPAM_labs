package by.gsu.epamlab;
import java.util.Arrays;

import static by.gsu.epamlab.Employee.printRuble;


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
            employees[4].setTransport(1649);  // Update  transportation expenses for the last object of the array

        }


        System.out.println("Duration = " + (employees[0].getDays() + (employees[1].getDays()))); // Output the total duration of two initial business trips
        System.out.println(Arrays.toString(employees)); //  Output the array content to the console using toString()

        System.out.print("Maximum cost is  " + printRuble(max));


    }


        }
















