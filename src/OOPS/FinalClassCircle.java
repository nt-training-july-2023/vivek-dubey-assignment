package OOPS;

public final class FinalClassCircle {
    private double radius;

    public FinalClassCircle(double r) {
        this.radius = r;
    }

    public double findRadius() {
        return radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}

// trying to generate a sub class of FinalClassCircle(compile - time -error)
// gives error because we can not extend a final class 
// class SubCircle extends FinalClassCircle {

// }

