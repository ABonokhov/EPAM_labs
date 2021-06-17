package by.gsu.epamlab;

public enum Material {
    STEEL("steel", 7850), COPPER("copper",8500);
    private final String name;
    private final double density;

    Material() {  // no-arg constructor
        this(null,0.0);
    }

     Material(String name, double density){ // parameterized constructor
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


