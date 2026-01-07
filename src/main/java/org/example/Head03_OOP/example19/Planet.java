package org.example.Head03_OOP.example19;

public enum Planet {
    MERCURY(3.303e+23,2.4397e6,"수성"),
    VENUS(4.869e+24,6.0518e6,"금성"),
    EARTH(5.976e+24,6.37814e6,"지구");

    private final double mess;
    private final double radius;
    private final String planetName;

    Planet(double mess, double radius, String planetName) {
        this.mess = mess;
        this.radius = radius;
        this.planetName = planetName;
    }

    public double surfaceGravity(){
        final double G = 6.67300E-11;
        return G*mess /(radius*radius);
    }
    @Override
    public String toString(){
        return name()+"(gravity=" + surfaceGravity()+ "행성 이름: " + planetName + ")";
    }


}
