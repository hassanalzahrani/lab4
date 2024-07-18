public class Rectangle extends Shape  {

    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateAre() {
        System.out.println(height*width);
    }

    @Override
    public void calculateCircumference() {
        System.out.println((height+width)*2);

    }
}
