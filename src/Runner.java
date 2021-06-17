import by.gsu.epamlab.Subject;
import by.gsu.epamlab.Material;

public class Runner {

    public static void main(String[] args) {
        final Material STEEL = new Material("steel",7850);
        Subject wire = new Subject("wire", STEEL, 0.03); //object which represents a steel wire having the volume 0.03 cubic meters.
        System.out.println(wire);
        final Material COPPER = new Material("copper",8500); // // Update the wire material to the copper
        wire.setMaterial(COPPER);
        System.out.println("The wire mass is " + wire.getMass() + " kg");  //output copper mass
    }
}
