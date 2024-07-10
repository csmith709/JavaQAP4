package Problem2;

public abstract class Shape implements Scalable{
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public void scale(double factor) {
        // Abstract method to be overridden in subclasses
    }

    public abstract double computePerimeter();
    public abstract double computeArea();

    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}