package by.gsu.epamlab;

public class Material {
    private String name;
    private final double density;

    public Material() {  // no-arg constructor
        this(null,0);
    }
    public Material(String name, double density){ // parameterized constructor
        this.name = name;
        this.density = density;
    }

    public String getName() {   // getters
        return name;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {          // returns a string representation of uniform material in the csv–format
        return name + ';' + density;
    }
}

