public class Triangle extends Shape {
    private double height;
    private double base;

    public double getHeight() {
        return height;
    }

    public Triangle() {
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void calculateAre() {
        System.out.println(0.5*base*height);

    }

    @Override
    public void calculateCircumference() {
        System.out.println(base+height+height);

    }
}
