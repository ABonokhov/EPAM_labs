import by.gsu.epamlab.Subject;
import static by.gsu.epamlab.Material.COPPER;
import static by.gsu.epamlab.Material.STEEL;

public class Runner {

    public static void main(String[] args) {
    Subject wire = new Subject("wire", STEEL, 0.03); // object which represents a steel wire having the volume 0.03 cubic meters
    System.out.println(wire); // output object which represents a steel
    wire.setMaterial(COPPER); // Update the wire material to the copper
    System.out.println("The wire mass is " + wire.getMass() + " kg");  //output copper mass

    }
}
