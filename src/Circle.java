public class Circle extends Shape {
    private double radius;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }




    @Override
    public void calculateAre() {
        System.out.println(Math.PI*radius*radius);
    }

    @Override
    public void calculateCircumference() {
        System.out.println(Math.PI*radius*2);

    }
}
