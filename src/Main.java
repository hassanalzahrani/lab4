

public class Main {
    public static void main(String[] args) {

        ///("Test for calculating circle Area and Circumference"
Circle c1 = new Circle(1.3);
        System.out.print(" the circle area is :"); c1.calculateAre();
        System.out.print(" the circle Circumference is :"); c1.calculateCircumference();


System.out.println("=========================================================");
System.out.println("=========================================================");



       /// Test for calculating Rectanle Area and  Circumference


Rectangle r1 = new Rectangle(2,3);
        System.out.print(" the rectangle area is :");  r1.calculateAre();
        System.out.print(" the rectangle Circumference is :");  r1.calculateCircumference();

        System.out.println("=========================================================");
        System.out.println("=========================================================");

        //////Test for calculating Trangle Area and circle Circumference


Triangle t1 = new Triangle(1.5,2.3);
        System.out.print(" the triangle area is :"); t1.calculateAre();
        System.out.print(" the trianglele Circumference is :");t1.calculateCircumference();











    }

}