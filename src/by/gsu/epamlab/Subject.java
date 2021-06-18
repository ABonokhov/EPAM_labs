package by.gsu.epamlab;

public class Subject {
    private String name;
    private Material material; //  //  using has-a relationship
    private double volume;

    public Subject() {
        this(null, null, 0);
    } //no-arg constructor;


    public Subject(String name, Material material, double volume) { // parameterized constructor
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public void setMaterial(Material material) { // getters/setters
        this.material = material;
    }

    public double getMass() {  // returns the subject mass
        return material.getDensity() * volume;
    }

    @Override
    public String toString() {
        return name + ';' + material + ';' + volume + ':' + getMass();  //returns a string representation of a subject in the csv–format
    }
}
