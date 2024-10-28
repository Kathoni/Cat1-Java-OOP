
public class TesterCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle();

        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);

        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        Circle c4 = new Circle(); // construct an instance of Circle
        c4.setRadius(5.5); // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("green"); // Change color
        System.out.println("color is: " + c4.getColor()); // Print color via getter
// You cannot do the following because setRadius() returns void, which cannot be printed
       // System.out.println(c4.setRadius(4.4));
        

    }
}
