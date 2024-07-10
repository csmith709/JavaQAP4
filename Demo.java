public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Circle1", 5);
        shapes[1] = new Ellipse("Ellipse1", 7, 5);
        shapes[2] = new Triangle("Triangle1", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("EquilateralTriangle1", 6);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
