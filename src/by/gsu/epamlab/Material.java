package by.gsu.epamlab;

public enum Material {
    STEEL(7850), COPPER(8500);
    private final double density;

    Material() {  // no-arg constructor
        this(0);
    }

    Material(double density) { // parameterized constructor
        this.density = density;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {   // returns a string representation of uniform material in the csv–format
        return name().toLowerCase() + ";" + density;
    }
}


