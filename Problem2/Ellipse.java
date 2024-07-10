package Problem2;

public class Ellipse extends Shape{
    protected double a;
    protected double b;

    public Ellipse (String name, double axis1, double axis2) {
        super(name);
        if (axis1 > axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }

    @Override
    public double computePerimeter() {
        return Math.PI * 2 * (a * a + b * b) - ((a - b) * (a - b)) / 2;
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }
}
