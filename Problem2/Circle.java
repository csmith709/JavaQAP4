package Problem2;

public class Circle extends Ellipse{
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}

