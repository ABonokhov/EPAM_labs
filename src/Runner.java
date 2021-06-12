import by.gsu.epamlab.BusinessTrip;

public class Runner {
    public static void main(String[] args) {

        BusinessTrip[]  businessTrips = {
                new BusinessTrip( "Karim Bataev", 1234, 12),
                new BusinessTrip( "Alexei Zareckiy", 1632, 11),
                null,
                new BusinessTrip( "Alesya Chernitskaya", 985, 7),
                new BusinessTrip(),
        };

        BusinessTrip maxTotal = new BusinessTrip();
        for (BusinessTrip  businessTrip :  businessTrips) {
            if (businessTrip != null) {
                businessTrip.show(); // Output the array content to the console, using show( ) method
                if (businessTrip.getTotal() > maxTotal.getTotal()) {
                    maxTotal = businessTrip;
                   
                }
            }
        }
        
        maxTotal.show();  // Output the business trip with maximum cost using show() method
        businessTrips[businessTrips.length - 1].setExpenses(1649); // Update  transportation expenses for the last object of the array
        System.out.println("Duration=" + (businessTrips[0].getDaysNumber() + businessTrips[1].getDaysNumber())); // Output the total duration of two initial business trips by the single operator

        for (BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }
    }
}

